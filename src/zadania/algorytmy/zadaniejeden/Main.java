package zadania.algorytmy.zadaniejeden;

import java.util.Scanner;

class Main {
    public static final int ESCAPE = 100;

    public static void main(String[] args) {
        int sum = getSum();
        String oddOrEvenString = oddOrEven(sum);

        System.out.printf("Suma wprowadzonych liczb to %d i jest to liczba %s",sum , oddOrEvenString);

    }

    private static String oddOrEven(int sum) {
        String oddOrEven = sum % 2 == 0? "parzysta":"nieparzysta";
        return oddOrEven;
    }

    private static int getSum() {
        int sum = 0;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        while((next = scanner.nextInt()) <= 100) {
            sum += next;
        }
        return sum;
    }
}
