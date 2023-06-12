package ru.cinimex.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        boolean isStopTheGame = false;
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber();

        game.createPlayers();
        do {
            boolean isValidExitAnswer = false;
            game.startGame();
            do {
                System.out.print("\nХотите повторить игру? [yes/no]: ");
                String reply = scanner.nextLine();
                if (reply.equals("yes")) {
                    isStopTheGame = true;
                    isValidExitAnswer = true;
                } else if (reply.equals("no")) {
                    isStopTheGame = false;
                    isValidExitAnswer = true;
                } else {
                    isValidExitAnswer = false;
                }
            } while (!isValidExitAnswer);
        } while (isStopTheGame);
    }
}
