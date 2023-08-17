package zadania.petle.zadaniejeden;

import java.util.Scanner;

//Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb chce wprowadzić.
// Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie wynik. W programie wykorzystaj
// co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic.
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
        int howManyNumbers = scanner.nextInt();

        int sum = 0;
        while (howManyNumbers-- > 0) {
            System.out.println("Podaj kolejną liczbę");
            sum += scanner.nextInt();
        }
        System.out.printf("Suma liczb wprowadzonych to %d ", sum);
    }
}
