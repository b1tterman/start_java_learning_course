package ru.cinimex.startjava.lesson_2_3_4.robot;

public class JaegerTest{
    public static void main(String[] args){

        Jaeger jaegerOne = new Jaeger("Coyote Tango" ,"Mark-1" ,"Japan", 85.34F, 2.312F, 7, 4);
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Gipsy Danger");
        jaegerTwo.setMark("Mark-3");
        jaegerTwo.setOrigin("USA");
        jaegerTwo.setHeight(79.25F);
        jaegerTwo.setWeight(1.980F);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(6);

        System.out.println("Выведем информацию о первом Егере");
        System.out.println("Название: " + jaegerOne.getModelName());
        System.out.println("Модель: " + jaegerOne.getMark());
        System.out.println("Страна создания: " + jaegerOne.getOrigin());
        System.out.println("Масса (в тоннах): " + jaegerOne.getHeight());
        System.out.println("Высота (в метрах): " + jaegerOne.getWeight());
        System.out.println("Сила: " + jaegerOne.getStrength());
        System.out.println("Броня: " + jaegerOne.getArmor());
        jaegerOne.move();

        System.out.println("\nВыведем информацию о втором Егере");
        System.out.println("Название: " + jaegerTwo.getModelName());
        System.out.println("Модель: " + jaegerTwo.getMark());
        System.out.println("Страна создания: " + jaegerTwo.getOrigin());
        System.out.println("Масса (в тоннах): " + jaegerTwo.getHeight());
        System.out.println("Высота (в метрах): " + jaegerTwo.getWeight());
        System.out.println("Сила: " + jaegerTwo.getStrength());
        System.out.println("Броня: " + jaegerTwo.getArmor());
        System.out.println("Боевой стиль: " + jaegerTwo.bodyLanguage());
    }
}