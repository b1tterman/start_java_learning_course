package ru.cinimex.startjava.lesson_2_3_4.animal;

public class WolfTest {
       public static void main(String[] args) {

        Wolf wolf = new Wolf();
        wolf.setNickName("Серый");
        wolf.setSex("Мужской");
        wolf.setHeight(25);
        wolf.setAge(5);
        wolf.setColor("Черно-серо-белый");

        System.out.println("Кличка волка: " + wolf.getNickName());
        System.out.println("Пол волка: " + wolf.getSex());
        System.out.println("Вес волка: " + wolf.getHeight() + "кг");
        System.out.println("Возраст волка: " + wolf.getAge() + " лет");
        System.out.println("Окрас волка: " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }

}