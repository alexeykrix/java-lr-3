public class Task1 {
    public static void main(String[] args) {
        FindZeroTest();
        ReplaceMiddleTest();
        ArrayOperationTest();
        ArrayOperation2Test();
        ArrayOperation3Test();
        ArrayOperation4Test();
    }

    /*
       1. Напишіть програму, що друкує номер першого нульового елемента заданого масиву
        чи повідомлення про те, що масив не містить нульових елементів.
    */
    public static void FindZeroTest() {
        int[] array = {1, 2, 3, 0, 5, 6, 7};
        int zeroIndex = FindZeroIndex(array);

        System.out.println("\nTask 1. Find zero");

        if (zeroIndex != -1) {
            System.out.println("Номер першого нульового елемента: " + zeroIndex);
        } else {
            System.out.println("Масив не містить нульових елементів.");
        }
    }
    private static int FindZeroIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    /*
        2. Напишіть програму, що заміняє всі елементи заданого масиву,
        крім крайніх, на півсуму сусідніх, і друкує результат.
    */

    public static void ReplaceMiddleTest() {
        int[] array = {1, 3, 5, 3, 1};

        replaceMiddleElements(array);

        System.out.println("\nTask 1. Replace middle");
        System.out.print("Масив після заміни середніх елементів: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void replaceMiddleElements(int[] arr) {
        if (arr.length <= 2) {
            System.out.println("Масив занадто короткий для заміни середніх елементів.");
            return;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
        }
    }

    /*
        3. В одновимірному масиві, що складається з дійсних елементів,
        обчислити мінімальний елемент масиву; суму елементів масиву,
        розташованих між першим і останнім додатними елементами. Перетворити
        масив таким чином, щоб спочатку розташовувалися всі елементи рівні нулю,
        а потім − всі інші
    */
    public static void ArrayOperationTest() {
        System.out.println("\n\nTask 1. Array operations");
        ArrayOperations.main();
    }

    /*
        4.В одновимірному масиві, що складається з цілих елементів,
        обчислити номер максимального елемента масиву; добуток елементів масиву,
        розташованих між першим і другим нульовими елементами. Перетворити масив таким чином,
        щоб у першій його половині розташовувалися елементи, що стояли на непарних позиціях,
        а в другій половині − елементи, що стояли на парних позиціях.
    */

    public static void ArrayOperation2Test() {
        System.out.println("\n\nTask 1. Array operations 2");
        ArrayOperations2.main();
    }

    /*
        5. В одновимірному масиві, що складається з дійсних елементів,
        обчислити добуток додатних елементів масиву; суму елементів масиву,
        розташованих до мінімального елемента. Упорядкувати за зростанням окремо елементи,
        що розташовані на парних місцях, і елементи, що розташовані на непарних місцях.
    */

    public static void ArrayOperation3Test() {
        System.out.println("\n\nTask 1. Array operations 3");
        ArrayOperations3.main();
    }

    /*
        6. В одновимірному масиві, що складається з дійсних елементів,
        обчислити кількість елементів масиву, що лежать у діапазоні від А до В;
        суму елементів масиву, розташованих після максимального елемента.
        Упорядкувати елементи масиву за спаданням модулів елементів.
    */

    public static void ArrayOperation4Test() {
        System.out.println("\n\nTask 1. Array operations 4");
        ArrayOperations4.main();
    }

}
