public class ArrayOperations {
    public static void main() {
        double[] array = {-2.5, 0, 1.2, -4.3, 3.0, 2.1, -1.5, 5.7, 0.8};

        double minElement = findMinElement(array);
        System.out.println("Мінімальний елемент масиву: " + minElement);

        double sumBetweenPositives = findSumBetweenPositives(array);
        System.out.println("Сума елементів масиву, розташованих між першим і останнім додатними елементами: " + sumBetweenPositives);

        transformArray(array);

        System.out.print("Масив після перетворення: ");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    private static double findMinElement(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static double findSumBetweenPositives(double[] arr) {
        int firstPositiveIndex = -1;
        int lastPositiveIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (firstPositiveIndex == -1) {
                    firstPositiveIndex = i;
                }
                lastPositiveIndex = i;
            }
        }

        double sum = 0;
        if (firstPositiveIndex != -1 && lastPositiveIndex != -1 && lastPositiveIndex > firstPositiveIndex) {
            for (int i = firstPositiveIndex + 1; i < lastPositiveIndex; i++) {
                sum += arr[i];
            }
        }

        return sum;
    }

    private static void transformArray(double[] arr) {
        java.util.List<Double> zeros = new java.util.ArrayList<>();
        java.util.List<Double> nonZeros = new java.util.ArrayList<>();

        for (double element : arr) {
            if (element == 0) {
                zeros.add(element);
            } else {
                nonZeros.add(element);
            }
        }

        int index = 0;
        for (double zero : zeros) {
            arr[index++] = zero;
        }
        for (double nonZero : nonZeros) {
            arr[index++] = nonZero;
        }
    }
}
