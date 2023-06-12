package ru.cinimex.startjava.lesson_1.finall;

public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        char sign = '^';

        if (sign == '+') {
            System.out.println(a + " " + sign + " " + b + " = " + (a + b));
        } else if (sign == '-') {
            System.out.println(a + " " + sign + " " + b + " = " + (a - b));
        } else if (sign == '*') {
            System.out.println(a + " " + sign + " " + b + " = " + (a * b));
        } else if (sign == '/') {
            System.out.println(a + " " + sign + " " + b + " = " + (a / b));
        } else if (sign == '^') {
            int result = 1;
            for (int i = 0; i < b; i++){
                result = a * result;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '%') {
            System.out.println(a + " " + sign + " " + b + " = " + (a % b));
        }
    }
}