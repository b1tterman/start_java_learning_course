package ru.cinimex.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int nums : firstNumArray) {
            System.out.print(nums + " ");
        }

        for (int i = 0; i < firstNumArray.length / 2; i++) {
            int tmp = firstNumArray[i];
            firstNumArray[i] = firstNumArray[firstNumArray.length - i - 1];
            firstNumArray[firstNumArray.length - i - 1] = tmp;
        }
        System.out.println("");

        for (int nums : firstNumArray) {
            System.out.print(nums + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] secondNumArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int multiply = 1;
        int myResult = 40320;
        for (int i = 1; i < 9; i++) {
            multiply = multiply * secondNumArray[i];
            System.out.print(i);
            if (i < 8) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + multiply);

        System.out.println((multiply == myResult) ? "\nЦикл правильно сосчитал произведение чисел" : "\nЦикл совершил ошибку в рассчетах");

        System.out.println("\n3. Удаление элементов массива");

          /*
        a. заполните массив размерностью 15 случайными вещественными числами в полуинтервале [0, 1)
        b. возьмите число из средней ячейки массива
        c. перезапишите в массиве на 0 все числа, которые больше этого значения
        d. отобразите:
            i. исходный и измененный массив по 8 и 7 чисел в строке
            ii.количество обнуленных ячеек
         */

        double[] thirdDoubleArray = new double[15];
        System.out.println("Сгенерированный массив");
        for (int i = 0; i < 15; i++) {
            thirdDoubleArray[i] = Math.random();
            System.out.print(thirdDoubleArray[i] + "   ");
            if (i == 7) {
                System.out.println();
            }
        }

        int countUpdate = 0;
        double middle = thirdDoubleArray[7];
        for (int i = 0; i < 15; i++) {
            if (thirdDoubleArray[i] > middle) {
                thirdDoubleArray[i] = 0;
                countUpdate++;
            }
        }

        System.out.println("\n\nОбновленный массив");

        for (int i = 0; i < 15; i++) {
            System.out.print(thirdDoubleArray[i] + "   ");
            if (i == 7) {
                System.out.println();
            }
        }

        System.out.println("\nКоличество обновленных элементов: " + countUpdate);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        int charZ = 90;
        char[] forthCharArray = new char[26];

        for (int i = 0; i < 26; i++) {
            forthCharArray[i] = (char) charZ;
            charZ--;
        }

        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(forthCharArray[j]);
            }
            System.out.println("");
        }

        System.out.println("\n5. Генерация уникальных чисел");

        int Min = 60;
        int Max = 90;
        int newNum;
        int[] fifthNumArray = new int[30];
        int[] fifthNumArrayCopy = new int[30];

        for (int i = 0; i < fifthNumArray.length; i++) {
            do {
                newNum = Min + (int) (Math.random() * ((Max - Min) + 1));
            }
            while (newNumInArray(newNum, fifthNumArray));
            fifthNumArray[i] = newNum;
        }

        System.arraycopy(fifthNumArray, 0, fifthNumArrayCopy, 0, fifthNumArray.length);
        bubbleSort(fifthNumArrayCopy);
        for (int i = 0; i < fifthNumArrayCopy.length; i++) {
            System.out.print(fifthNumArrayCopy[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }

        System.out.println("\n6*. Сдвиг элементов массива");
        int countNotBlank = 0;
        String[] firstArray = new String[]{"", "AA", "", "", "BBB", "C", "", "DDDD"};

        for (String strings : firstArray) {
            if (!strings.isBlank()) countNotBlank++;
        }
        System.out.println("countNotBlank = " + countNotBlank);
        String[] secondArray = new String[countNotBlank];
        System.arraycopy(firstArray, 1, secondArray, 0, 1);
        System.arraycopy(firstArray, 4, secondArray, 1, 2);
        System.arraycopy(firstArray, 7, secondArray, 3, 1);
        for (String strings : secondArray) {
            System.out.println(strings);
        }
    }


    static boolean newNumInArray(int element, int[] array) {
        boolean result = false;
        for (int nums : array) {
            if (nums == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }


}

