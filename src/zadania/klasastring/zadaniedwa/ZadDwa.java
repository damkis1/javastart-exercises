package zadania.klasastring.zadaniedwa;

import java.util.Scanner;

class ZadDwa {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String writing = readTextFromUser();
        textAfterModification(writing);
    }

    private static void textAfterModification(String writing) {
        System.out.println("Zmodyfikowany test");
        System.out.println(modificatedString(writing));
    }

    private static String readTextFromUser() {
        System.out.println("Wprowadź tekst: ");
        String writing = scanner.nextLine();
        return writing;
    }

    private static String modificatedString(String entry) {
        String result = "";
        if (Character.isUpperCase(entry.charAt(0))) {
            result = entry.toUpperCase();
        } else if (Character.isLowerCase(entry.charAt(0))) {
            result = entry.toLowerCase();
        } else if (Character.isDigit(entry.charAt(0))) {
            return result = entry;
        }
        return result;
    }
}
