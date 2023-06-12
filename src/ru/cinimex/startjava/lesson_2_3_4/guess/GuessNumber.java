package ru.cinimex.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;


public class GuessNumber {

    private int secret;
    private final Player[] players = new Player[3];

    public int getSecret() {
        return secret;
    }

    public void setSecret() {
        this.secret = (int) (Math.random() * 100) + 1;
    }

    public void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.nextLine());
        }
    }

    private void clearPlayers() {
        for (Player player : players) {
            player.setCountAttempts(0);
            Arrays.fill(player.getGuessedNums(), 0);
        }
    }

    private void printNums(Player player) {
        System.out.print("Игрок " + player.getName() + " вводил числа: ");
        for (int num : player.getGuessedNums()) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }


    public boolean isPlayerWin(int num, Player player) {
        if (num == secret) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secret + " с " +
                    player.getCountAttempts() + " попытки");
            return true;
        }
        String info = num > secret ? "больше" : "меньше";
        System.out.println("Данное число " + info + " того, что загадал компьютер");
        return false;
    }


    public void startGame() {
        setSecret();
        System.out.println("Загаданное число: " + secret);
        clearPlayers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток.");
        for (int i = 0; i < 10; i++) {
            for (Player player : players) {
                System.out.print("Игрок " + player.getName() + " введите число: ");
                int playerNum = scanner.nextInt();
                player.setGuessedNum(i, playerNum);
                player.setCountAttempts(player.getCountAttempts() + 1);
                if (isPlayerWin(playerNum, player)) {
                    for (Player playerAttempts : players) {
                        printNums(playerAttempts);
                    }
                    return;
                }
                if (i == 9) System.out.println("У игрока " + player.getName() + " закончились попытки.");
            }
        }
        printNums(players[0]);
        printNums(players[1]);
        printNums(players[2]);
    }

}