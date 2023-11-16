import java.util.Arrays;

public class ArrayOperations4 {
    public static void main() {
        double[] array = {3.5, -2.1, 4.2, 0.8, -1.7, 2.3, 1.1, 5.0, -3.2};

        double A = -2.0;
        double B = 2.0;

        int countInRange = countElementsInRange(array, A, B);
        System.out.println("Кількість елементів у діапазоні від " + A + " до " + B + ": " + countInRange);

        double sumAfterMax = calculateSumAfterMax(array);
        System.out.println("Сума елементів масиву, розташованих після максимального елемента: " + sumAfterMax);

        sortArrayByAbsoluteValuesDescending(array);

        System.out.print("Масив після упорядкування за спаданням модулів: ");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    private static int countElementsInRange(double[] arr, double A, double B) {
        int count = 0;
        for (double element : arr) {
            if (element >= A && element <= B) {
                count++;
            }
        }
        return count;
    }

    private static double calculateSumAfterMax(double[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        double max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        double sum = 0;
        for (int i = maxIndex + 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static void sortArrayByAbsoluteValuesDescending(double[] arr) {
        // Використовуємо власний компаратор для сортування за модулями
        Double[] boxedArray = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxedArray[i] = arr[i];
        }

        Arrays.sort(boxedArray, (a, b) -> Double.compare(Math.abs(b), Math.abs(a)));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArray[i];
        }
    }
}
