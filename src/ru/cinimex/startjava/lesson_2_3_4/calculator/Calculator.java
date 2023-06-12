package ru.cinimex.startjava.lesson_2_3_4.calculator;

import java.io.Serializable;

public class Calculator {

    private static int firstNumber;
    private static char sign;
    private static int secondNumber;

    private static String[] inputMath(String someMath) {
        parseMath(someMath.split(" "));
        return new String[0];
    }

    private static void parseMath(String[] array) {
        String[] getMath = array;
        if (getMath.length == 3) {
            try {
                int temp = Integer.parseInt(getMath[0]);
                if ((temp % 1 == 0) && (temp >= 0)) {
                    firstNumber = temp;
                }
            } catch (Exception e) {
                System.out.println("Введите целое положительное число");
                firstNumber = 0;
            }
            sign = getMath[1].charAt(0);
            try {
                int temp = Integer.parseInt(getMath[2]);
                if ((temp % 1 == 0) && (temp > 0)) {
                    secondNumber = temp;
                }
            } catch (Exception e) {
                System.out.println("Введите целое положительное число");
                firstNumber = 0;
                secondNumber = 0;
            }
        }
    }

    public static int calculate(String someMath) {
        String[] getMath = inputMath(someMath);
        int result = switch (sign) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            case '%' -> firstNumber % secondNumber;
            case '^' -> (int) Math.pow(firstNumber, secondNumber);
            default -> 0;
        };
        return result;
    }
}
