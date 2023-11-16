public class ArrayOperations2 {
    public static void main() {
        int[] array = {3, 7, 1, 0, 4, 6, 9, 0, 2, 8};

        int maxElementIndex = findMaxElementIndex(array);
        System.out.println("Номер максимального елемента масиву: " + maxElementIndex);

        int productBetweenZeros = findProductBetweenZeros(array);
        System.out.println("Добуток елементів масиву між першим і другим нульовими елементами: " + productBetweenZeros);

        transformArray(array);

        System.out.print("Масив після перетворення: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int findMaxElementIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int findProductBetweenZeros(int[] arr) {
        int firstZeroIndex = -1;
        int secondZeroIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    secondZeroIndex = i;
                    break;
                }
            }
        }

        int product = 1;
        if (firstZeroIndex != -1 && secondZeroIndex != -1 && secondZeroIndex > firstZeroIndex) {
            for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                product *= arr[i];
            }
        }

        return product;
    }

    private static void transformArray(int[] arr) {
        int[] transformedArray = new int[arr.length];

        for (int i = 1, j = 0; i < arr.length; i += 2, j++) {
            transformedArray[j] = arr[i];
        }

        for (int i = 0, j = arr.length / 2; i < arr.length; i += 2, j++) {
            transformedArray[j] = arr[i];
        }

        System.arraycopy(transformedArray, 0, arr, 0, arr.length);
    }
}
