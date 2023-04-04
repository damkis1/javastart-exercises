package zadania.instrukcjesterujace.zadaniedwa;

public class NumberMethods {
    void compareNumberAndPrint(int number, int compareTo) {
        if (number < compareTo) {
            System.out.printf("%d jest mniejsza niż %d\n", number, compareTo);
        } else if (number == compareTo) {
            System.out.printf("%d jest równa %d\n", number, compareTo);
        } else System.out.printf("%d jest większa niż %d\n", number, compareTo);
    }

    void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.printf("%d jest parzysta\n", number);
        } else System.out.printf("%d jest nie parzysta\n", number);
    }
    int getFourDigitNumber(int number) {
        if (number == 0)
            return 0;
        else if (number / 1000 != 0)
            return number;
        else if (number / 100 != 0)
            return number * 10;
        else if (number / 10 != 0)
            return number * 100;
        else
            return number * 1000;
    }
}
