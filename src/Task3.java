/*
    1. Визначити і надрукувати кількість додатних елементів кожного стовпця матриці.
    2. Знайти суму додатних елементів квадратної матриці, які розміщені на її головній діагоналі.
    3. На головній діагоналі квадратной матрицізнаходяться елементи рівні 1,
    нижче головної діагоналі - 0, а вище - сумі індексів. Оформити заповнення масиву у
    вигляді окремої функції. Виведіть матрицю на екран (функція).
*/

public class Task3 {
    public static void main(String[] args) {
        int size = 4;

        int[][] matrix = new int[size][size];
        fillMatrix(matrix);

        // Виведення матриці на екран
        System.out.println("Початкова матриця:");
        printMatrix(matrix);

        // 1. Визначення і надрук кількості додатніх елементів кожного стовпця
        countPositiveElementsInColumns(matrix);

        // 2. Знайдення суми додатніх елементів на головній діагоналі
        int sum = sumPositiveElementsOnMainDiagonal(matrix);
        System.out.println("Сума додатніх елементів на головній діагоналі: " + sum);

        // 3. Оформлення заповнення матриці у вигляді окремої функції
        fillMatrixSpecial(matrix);

        // Виведення матриці після внесення змін
        System.out.println("Матриця після змін:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static void countPositiveElementsInColumns(int[][] matrix) {
        System.out.println("Кількість додатніх елементів кожного стовпця:");
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.println("Стовпець " + j + ": " + count);
        }
    }

    private static int sumPositiveElementsOnMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }

    private static void fillMatrixSpecial(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1; // Головна діагональ
                } else if (i > j) {
                    matrix[i][j] = 0; // Нижче головної діагоналі
                } else {
                    matrix[i][j] = i + j; // Вище головної діагоналі
                }
            }
        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 201) - 100;
            }
        }
    }
}
