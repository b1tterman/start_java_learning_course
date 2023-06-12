package ru.cinimex.startjava.lesson_1.finall;

public class MyFirstGame {

    public static void main(String[] args) {
        int min = 0;
        int max = 99;
        int secret = 0;
        int middle;
                
        while (min < max) {
            middle = (min + max) / 2;
            if (secret == middle) {
                System.out.println("Поздравляю, вы угадали число find " + secret);
                break;                
            } else if (secret > middle) {
                System.out.println("Загаданное число больше чем > " + middle);
                min = middle + 1;            
            } else {
                System.out.println("Загаданное число меньше чем < " + middle);
                max = middle -1;
            }
        }
    }
}