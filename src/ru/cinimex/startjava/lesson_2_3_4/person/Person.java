package ru.cinimex.startjava.lesson_2_3_4.person;

public class Person {
    String name = "Ivan";
    String sex = "Male";
    int height = 180;
    int weight = 70;
    int age = 30;

    void walk() {
        System.out.println("Человек идёт");
    }

    void sit() {
        System.out.println("Человек сидит");
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void talk() {
        System.out.println("Человек говорит");
    }

    String learnJava() {
        return "Предстоит много изучать и практиковаться в Java";
    }
}