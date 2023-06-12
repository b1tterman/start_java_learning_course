package ru.cinimex.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int countAttempts;
    private final int[] guessedNums = new int[10];


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }

    public int[] getGuessedNums() {
        int[] arrayCopy = Arrays.copyOf(guessedNums, countAttempts);
        return arrayCopy;
    }

    public void setGuessedNum(int i, int playerNum) {
        if ((playerNum > 0) && (playerNum <= 100)){
        this.guessedNums[i] = playerNum;
        }
        else {
            System.out.println("Вы ввели число не входящее в диапазон (0, 100]");
            this.guessedNums[i] = 0;
        }
    }


}