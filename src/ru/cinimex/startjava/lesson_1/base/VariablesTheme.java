package ru.cinimex.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль\n");
        byte coreCount = 4;
        short coreFreq = 3100;
        int ram = 16384;
        long totalHddSpace = 499_448_385_536L;
        float turboBoostFreq = 3500.0f;
        double pi = 3.141_592_653;
        char charValue = 'Z';
        boolean isIntel = true;
        System.out.println("I have " + coreCount + " cores Intel CPU (this is " + isIntel + ") with default " + coreFreq + " frequency and " + turboBoostFreq + " turboBoost frequency.");
        System.out.println("My PC has " + ram + "Mb RAM memory, HDD got " + totalHddSpace + " bytes, number PI = " + pi + ", last letter in ABC is: " + charValue +".");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int priceX = 100;
        int priceY = 200;
        int discount = 11;
        float discountSum = (priceY + priceY)/discount;
        System.out.println("Discount will be " + discountSum + " rub, total price with discount is " + (priceX + priceY - discountSum) + " rub.");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J     a  v     v  a");
        System.out.println("   J    a a  v   v  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ   a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");  
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        
        System.out.println("maxByte = " + maxByte + ", maxByte + 1 = " + (byte)(maxByte + 1) + ", maxByte + 1 - 1 = " + (maxByte--));
        System.out.println("maxShort = " + maxShort + ", maxShort + 1 = " + (short)(maxShort + 1)  + ", maxShort + 1 - 1 = " + maxShort--);
        System.out.println("maxInt = " + maxInt + ", maxInt + 1 = " + (int)(maxInt + 1) + ", maxInt + 1 - 1 = " + maxInt--);
        System.out.println("maxLong = " + maxLong + ", maxLong + 1 = " + (long)(maxLong + 1) + ", maxLong + 1 - 1 = " + maxLong--);

        System.out.println("\n5. Перестановка значений переменных\n");  
        int first = 1;
        int second = 2;
        int third;
        System.out.println("Replace values with third variable. Values before: fisrt = " + first + ", second = " + second);
        third = first;
        first = second;
        second = third;
        System.out.println("Replace values with third variable. Values after: fisrt = " + first + ", second = " + second);

        System.out.println("Replace with arifmetic operations. Values before: fisrt = " + first + ", second = " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Replace with arifmetic operations. Values after: fisrt = " + first + ", second = " + second);

        System.out.println("Replace with XOR. Values before: fisrt = " + first + ", second = " + second); 
        first = first ^ second;
        second = second ^ first;
        first = first ^ second;
        System.out.println("Replace with XOR. Values after: fisrt = " + first + ", second = " + second);

        System.out.println("\n6. Вывод символов и их кодов\n");  
        byte firstByte = 35;
        byte secndByte = 38;
        byte thirdByte = 64;
        byte forthByte = 94;
        byte fifthByte = 95;

        System.out.println("firstByte = " + firstByte + ", in ASCII = " + (char)firstByte);
        System.out.println("secndByte = " + secndByte + ", in ASCII = " + (char)secndByte);
        System.out.println("thirdByte = " + thirdByte + ", in ASCII = " + (char)thirdByte);
        System.out.println("forthByte = " + forthByte + ", in ASCII = " + (char)forthByte);
        System.out.println("fifthByte = " + fifthByte + ", in ASCII = " + (char)fifthByte);

        System.out.println("\n7. Произведение и сумма цифр числа\n");  
        int num = 345;        
        int sum = 0;
        int proizv = 1;
        int currentDigit = num % 10;
        proizv *= currentDigit;
        sum += currentDigit;        
        num /= 10;
        currentDigit = num % 10;
        proizv *= currentDigit;
        sum += currentDigit;
        num /= 10;
        currentDigit = num % 10;
        proizv *= currentDigit;
        sum += currentDigit;
        System.out.println("Сумма цифр числа N = " + sum + "\nПроизведение цифр числа N = " + proizv);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");  
        int space = 32;
        int slash = 47;
        int backslash = 92;
        int skobka = 40;
        int backskobka = 41;
        int podcherkivanie = 95;
        String firstLine = "" + (char)space + (char)space + (char)space + (char)space + (char)slash + (char)backslash;
        String secondLine = "" + (char)space + (char)space + (char)space + (char)slash + (char)space + (char)space + (char)backslash;
        String thirdLine = "" + (char)space + (char)space + (char)slash + (char)podcherkivanie + (char)skobka + (char)space + (char)backskobka + (char)backslash;
        String forthLine = "" + (char)space + (char)slash + (char)space + (char)space + (char)space + (char)space + (char)space + (char)space + (char)backslash;
        String fifthLine = "" + (char)slash + (char)podcherkivanie + (char)podcherkivanie + (char)podcherkivanie + (char)podcherkivanie + (char)slash + (char)backslash + (char)podcherkivanie + (char)podcherkivanie + (char)backslash;
        System.out.println(firstLine +"\n" + secondLine +"\n" + thirdLine +"\n" + forthLine +"\n"+ fifthLine);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа\n"); 
        int newNum = 123;
        System.out.println("Число " + newNum + " содержит " + newNum / 100 + " сотен, " + (newNum % 100) / 10  + " десятков и " + newNum % 10 + " единиц.");

        System.out.println("\n10. Преобразование секунд\n"); 
        int seconds = 86399;
        System.out.println("Количество секунд " + seconds + " равно " + seconds / 3600 + ":" + seconds / 60 % 60  + ":" + seconds % 60);        


            }
}