import java.util.Arrays;

public class Task01 {

    public static void creatingAUnit(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j) {
                    array[i][j] = 0;
                } else {
                    if (i > j) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void creatingAUnit2(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (i > j) {
                    array[i][j] = 0;
                } else {
                    if (i < j) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void creatingZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }


    }

    public static void matrixSum(int[][] arrayA, int[][] arrayB) {
        int[][] arrayC = new int[arrayA.length][arrayB.length];

        // Заполнение и печать на экран матрицы A
        System.out.println(" Матрица A:");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayA[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" " + arrayA[i][j]);
            }
            System.out.println();
        }

        // Заполнение и печать на экран матрицы B
        System.out.println("\n Матрица B:");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" " + arrayB[i][j]);
            }
            System.out.println();
        }

        //Суммирование матриц
        System.out.println("\n Матрица С - сумма матриц:");

        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC.length; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }

        for (int[] ints : arrayC) {
            for (int j = 0; j < arrayC.length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.print("\n");
        }

    }

    public static void matrixMultiplication(int[][] arrayA, int[][] arrayB) {
        int[][] arrayC = new int[arrayA.length][arrayB.length];

        // Заполнение и печать на экран матрицы A
        System.out.println(" Матрица A:");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayA[i][j] = (int) (Math.random() * 5 + 1);
                System.out.print(" " + arrayA[i][j]);
            }
            System.out.println();
        }

        // Заполнение и печать на экран матрицы B
        System.out.println("\n Матрица B:");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = (int) (Math.random() * 5 + 1);
                System.out.print(" " + arrayB[i][j]);
            }
            System.out.println();
        }

        //Суммирование матриц
        System.out.println("\n Матрица С - сумма матриц:");

        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC.length; j++) {
                arrayC[i][j] = arrayA[i][j] * arrayB[i][j];
            }
        }

        for (int[] ints : arrayC) {
            for (int j = 0; j < arrayC.length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.print("\n");
        }

    }

    public static void determinant(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 5 + 1);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Матрица: ");
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.print("\n");
        }



    }

    public static void print(int[][]array){
        System.out.println("Матрица: ");
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int[][] arrayA = new int[4][4];
        int[][] arrayB = new int[4][4];


//        creatingAUnit(array); // создания единичной (диагональной) матрицы;
//        creatingAUnit2(array); // создания единичной (диагональной) матрицы;
//        creatingZero(array); //создания нулевой матрицы;
//        matrixSum(arrayA, arrayB); //сложение матриц;
        matrixMultiplication(arrayA, arrayB); //умножения матриц;


    }
}

