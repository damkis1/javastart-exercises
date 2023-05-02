package zadania.wprowadzaniedanych.zadaniedwa;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        showOptions();
        int choice = scanner.nextInt();
        int luck = random.nextInt(2);
        System.out.println(luck);
        game(choice, luck);

    }
    private static void game(int choice, int luck) {
        String heads  = "orzeł";
        String tails = "reszka";
        String score;
        String result;
        score = luck == 1 ? heads:tails;
        result = choice == luck ? String.format("Brawo wypadł/a %s i wygyrwasz\n", score) :
                String.format("Przykro mi wypadł/a %s i przegrywasz\n", score);
        System.out.println(result);
    }

    private static void showOptions(){
        String options = """
                Wybierz jedną z opcji:
                1 - orzeł
                0 - reszka""";
        System.out.println(options);
    }
}
