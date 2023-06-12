package ru.cinimex.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 30;
        String sex = "female";
        float height = 1.50F;
        String name = "Ivan";

        if (age > 20) {
            System.out.println("You are too old to be a student");
            } else {
                System.out.println("Welcome to Hogwarts!");
            }

        if (sex != "male") {
            System.out.println("Sex of this person - female");
        }

        if (height < 1.80) {
            System.out.println("Hello, mister Frodo!");            
        } else {
            System.out.println("You cant enter here! You are too high");
        }

        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Name start with letter 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Seems his name is Ivan - typical russian name");
        } else {
            System.out.println("Name starts another letter...");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int digitOne = 15;
        int digitTwo = 20;
        if (digitOne > digitTwo) {
            System.out.println("Number " + digitOne + " is MAX, number " + digitTwo + " is MIN.");
        } else if (digitOne < digitTwo) {
            System.out.println("Number " + digitTwo + " is MAX, number " + digitOne + " is MIN.");
        } else {
            System.out.println("Number " + digitOne + " is EQUAL to number " + digitTwo);
        }

        System.out.println("\n3. Работа с числом\n");
        int digit = 15;
        if (digit == 0) {
            System.out.println("Number = " + digit);
        } else if (digit % 2 == 0) {
            if (digit > 0) {
            System.out.println("Number = " + digit + " is polojitelnoe and chetnoe");
            } else {
                System.out.println("Number = " + digit + " is otricatelnoe and chetnoe");
            }
        } else { if (digit > 0) {
            System.out.println("Number = " + digit + " is polojitelnoe and nechetnoe");
            } else {
                System.out.println("Number = " + digit + " is otricatelnoe and nechetnoe");
            }
        }


        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int first = 145;
        int second = 125;     
        System.out.println("Number " + first + " and number " + second + " got same digits. ");   
        if ((first / 100) == (second / 100)) {
            System.out.println( (first / 100) + " at first place. ");
        }
        if ((first % 100 / 10) == (second % 100 / 10)) {
            System.out.println((first % 100 / 10) + " at second place. ");  
        };
        if ((first % 10) == (second % 10)) {
            System.out.println((first % 10) + " at third place. ");  
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");
        char symbol = '\u0057';     
        System.out.println(symbol);
        if ((symbol >= 97) && (symbol < 123)) {
            System.out.println("Это маленькая буква.");
        } else if ((symbol >= 48) && (symbol < 58)) {
            System.out.println("Это число.");
        } else if ((symbol >= 65) && (symbol < 91)) {
            System.out.println("Это большая буква.");
        } else {
            System.out.println("Это не буква и не число.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");
        int summa = 300000;
        System.out.print("Сумма вклада " + summa + ", начисленный % будет ");
        if (summa < 100000) {
            System.out.println((summa*5)/100 + " рублей, сумма с % будет " + (summa + (summa*5)/100));
        } else if ((100000 <= summa) && (summa <= 300000)) {
            System.out.println((summa*7)/100 + " рублей, сумма с % будет " + (summa + (summa*7)/100));
        } else {
            System.out.println(summa/10 + " рублей, сумма с % будет " + (summa + summa/10));
        }
        

        System.out.println("\n7. Определение оценки по предметам\n");
            int history = 59;
            int coding = 91;
            int hist = 0;
            int code = 0;
            if (history <= 60) {
                hist = 2;
            } else if ((history > 60) && (history <= 73)) {   
                hist = 3;
            } else if ((history > 73) && (history <= 91)) {  
                hist = 4;
            } else { 
                hist = 5;
            }
            if (coding <= 60) {   
                code = 2;
            } else if ((coding > 60) && (coding <= 73)) {  
                code = 3;
            } else if ((coding > 73) && (coding <= 91)) {  
                code = 4;
            } else {  
                code = 5;
            }        
            System.out.println("Оценка по истории " + hist + ", оценка по программированию "  
                 + code + ". Средний балл оценок по предметам равен " + (hist+code)/2 + 
                ", средний % по предметам равен " + (history+coding)/2);

            System.out.println("\n8. Расчет прибыли\n");
            int arenda = 5000;
            int salesAvg = 13000;
            int itemCost = 9000;
            int yearMoney = (salesAvg - arenda - itemCost) * 12;
            if (yearMoney > 0){
                System.out.println("Прибыль за год: +" + yearMoney + " руб.");
            } else {
                System.out.println("Прибыль за год: " + yearMoney + " руб.");
            }

            System.out.println("\n9. Подсчет количества банкнот\n");
            int moneyNeed = 567;
            int countDesyatki = 5;
            int desyatki = moneyNeed % 100 / 10;
            System.out.print("Необходимую сумму " + moneyNeed + 
                " USD можно получить следующим количеством банкнот " + moneyNeed/100 + " по 100 USD, ");
            if (desyatki > countDesyatki) {
                int edinici = moneyNeed % 100 - desyatki*10 + (desyatki-countDesyatki)*10;
                System.out.print(countDesyatki + " банкнот по 10 USD, " + edinici + " по 1 USD.");
            } else if (desyatki <= countDesyatki){
                int edinici = moneyNeed % 100 - desyatki*10;
                System.out.print(desyatki + " банкнот по 10 USD, " + edinici + " по 1 USD.");
            }           
        }
    }
        


