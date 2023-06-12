package ru.cinimex.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String keepcalculateAnswer = "yes";
        String someMath = "";
        //Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.print("Введите математическое выражение: ");
        someMath = scanner.nextLine();
        System.out.println(Calculator.calculate(someMath));
            do{
                System.out.print("\n{Хотите продолжить вычисления}? [yes/no]: ");
                keepcalculateAnswer = scanner.nextLine();
            } while (!keepcalculateAnswer.equals("yes") && !keepcalculateAnswer.equals("no"));
        } while (keepcalculateAnswer.equals("yes"));
    }
}