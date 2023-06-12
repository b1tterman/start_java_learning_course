package ru.cinimex.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int i = -10;
        int chet = 0; 
        int nechet = 0;
        do {
            if (i % 2 == 0) {
                chet++;
            }
            else {
                nechet++;
            }
            i++;
        }
        while (i < 22);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + chet + ", а нечетных = " + nechet);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int x = 10;
        int y = 5;
        int z = -1;
        int max = x;
        int min = x;
        if (y > max) {
            max = y;
        } 
        if ( z > y) {
            max = z;
        }
        if (y < min) {
            min = y;
        }
        if ( z < y) {
            min = z;
        }
        System.out.println("min = " + min + ", max = " + max + ".");

        for (int j = max; j >= min; j--)
        {
            System.out.print(j + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sum = 0;
        System.out.print("исходное число в обратном порядке ");
        while (num != 0) {
            sum += (num % 10);
            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println("\nСумма его цифр " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");        
        int countt = 0;
        for (int k = 1; k < 24; k = k + 2) {
            countt++;
            System.out.printf("%3s", k);
            if (countt == 5) {
                System.out.println("");
                countt = 0;
            }       
        }
        if (countt < 5) {
            for (int d = 0; d < (5 - countt); d++) {
                System.out.printf("%3s", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        int num2 = 3141591;
        int count = 0;
        while (num2 > 0) {
            if ((num2% 10) == 1) {
                count++;
            }
            num2 /= 10;            
        }
        System.out.print("Число" + num2 + "содежит " + count);
        if (count % 2 == 0) {
            System.out.println(" - четное количество единиц.");
        } else {
            System.out.println(" - нечетное количество единиц.");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");        
        for (int m = 0; m < 5; m++) {
            System.out.println("**********");
        }
        System.out.println("");
        
        int n = 5;
        int size = n;
        while (size > 0) {
            int o = 1;
            while (o <= size){
                System.out.print("#");
                o++;            
            }
            System.out.println("");
            size--;
        }
        System.out.println("");

        int size2 = 3;
        int size3 = 1; 
        // сначала вывожу 2 строки
        do {
            int w = 0;                 
            do {
            System.out.print("$");
            w++;
            } while (w < size3);
            System.out.println("");
            size3++;            
        } while (size3 < 3);
        // потом 3 строки. как по-другому сделать не сообразил
        do { 
            int v = 0;            
            do {
            System.out.print("$");
            v++;
            } while (v < size2);
            System.out.println("");
            size2--;            
        } while (size2 > 0);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%3s %3s %n", "Dec","Char");       
        for (int r = 0; r < 48; r++) {
            if (r % 2 == 1) {           
                System.out.printf("%3s %3s %n", r,(char)r);
            }
        }
        for (int r = 97; r < 123; r++) {
            if (r % 2 == 0) {
                System.out.printf("%3s %3s %n", r,(char)r);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int palindrom = 1234321;
        int q = palindrom;
        int revers = 0; 
        while (q > 0) {           
            int r = q % 10;
            revers = revers * 10 + r;
            q /= 10;
        } 
        if (palindrom == revers) {
            System.out.println("Число " + palindrom + " является палиндромом");
        } else {
            System.out.println("Число " + palindrom + " не является палиндромом");
        } 
 
        System.out.println("\n9. Определение, является ли число счастливым\n");
        int happy = 531063;
        int num3 = happy;
        int sum1 = 0;
        int sum2 = 0;
        for (int s = 0; s < 3; s++) {
            sum2 += (num3 % 10);            
            num3 /= 10;            
        }
        for (int s = 0; s < 3; s++) {
            sum1 += (num3 % 10);            
            num3 /= 10;            
        }
        System.out.println("Сумма первых трех цифр равна " + sum1 + ", сумма вторых трех цифр равна " + sum2);
        if (sum1 == sum2){
            System.out.println("Число " + happy + " является счастливым");
        } else {
            System.out.println("Число " + happy + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");                
        String poloska = "|";
        String poloska2 = "\n------------------------------";
        System.out.printf("%6s %2s", "|", 2);
        for (int g = 3; g < 10; g++) {
            System.out.printf("%3s", g);            
        }
        System.out.println(poloska2);
        for (int l = 2; l < 10; l++){
            System.out.printf("%3s", l);
            System.out.printf("%3s", poloska);
            for (int u = 2; u < 10; u++){
                System.out.printf("%3s", l*u);
            }
            System.out.println("");
        }

    }       
}