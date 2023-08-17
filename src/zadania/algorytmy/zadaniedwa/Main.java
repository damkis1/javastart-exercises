package zadania.algorytmy.zadaniedwa;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int multi = getMulti();
        String positiveNegative = getPositiveNegative(multi);

        System.out.println(multi + " - " + positiveNegative);
    }

    private static String getPositiveNegative(int multi) {
        String positiveNegative = multi >= 0? "dodatnia":"ujemna";
        return positiveNegative;
    }

    private static int getMulti() {
        Scanner scanner = new Scanner(System.in);
        int multi = 1;
        for (int index = 0; index < 5; index++) {
            int next = scanner.nextInt();
            multi *= next;
        }
        scanner.close();
        return multi;
    }
}
