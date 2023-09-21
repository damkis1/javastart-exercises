package zadania.wyjatki.zadaniejeden;

import java.util.Scanner;

class Entry {

    private static final Scanner sc = new Scanner(System.in);

    double selectNumber() {
        return sc.nextDouble();
    }

    String selectSign() {
        return sc.nextLine();
    }

    void cleanScanner() {
        sc.nextLine();
    }

    void closeScanner() {
        sc.close();
    }
}
