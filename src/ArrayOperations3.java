import java.util.Arrays;

public class ArrayOperations3 {
    public static void main() {
        double[] array = {3.5, -2.1, 4.2, 0.8, -1.7, 2.3, 1.1, 5.0, -3.2};

        double positiveProduct = calculatePositiveProduct(array);
        System.out.println("Добуток додатних елементів масиву: " + positiveProduct);

        double sumBeforeMin = calculateSumBeforeMin(array);
        System.out.println("Сума елементів масиву, розташованих до мінімального елемента: " + sumBeforeMin);

        sortEvenOddElements(array);

        System.out.print("Масив після упорядкування: ");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    private static double calculatePositiveProduct(double[] arr) {
        double product = 1.0;
        for (double element : arr) {
            if (element > 0) {
                product *= element;
            }
        }
        return product;
    }

    private static double calculateSumBeforeMin(double[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        double min = arr[0];
        double sum = 0;

        for (double element : arr) {
            if (element < min) {
                min = element;
                break;
            }
            sum += element;
        }

        return sum;
    }

    private static void sortEvenOddElements(double[] arr) {
        double[] evenElements = new double[(arr.length + 1) / 2];
        double[] oddElements = new double[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenElements[i / 2] = arr[i];
            } else {
                oddElements[i / 2] = arr[i];
            }
        }

        Arrays.sort(evenElements);
        Arrays.sort(oddElements);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = evenElements[i / 2];
            } else {
                arr[i] = oddElements[i / 2];
            }
        }
    }
}
