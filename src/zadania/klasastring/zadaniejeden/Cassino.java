package zadania.klasastring.zadaniejeden;

import java.util.Scanner;

class Cassino {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        draw();
        String result = Dice.drawTheNumber();
        System.out.println(result);
    }
    private static void draw(){
        System.out.println("Wciśnij enter by wylosować liczbę");
        SCANNER.nextLine();
        System.out.println("Wylosowałeś kostkę: ");
    }
}
