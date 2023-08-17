package zadania.instrukcjesterujace.zadaniedwa;

import java.util.Random;
public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        NumberMethods numberMethods = new NumberMethods();

        int randomNumber = random.nextInt(1000);
        System.out.println("Wylosowana liczba to: " + randomNumber);
        numberMethods.compareNumberAndPrint(randomNumber,7000);
        numberMethods.evenOrOdd(randomNumber);

        System.out.println(numberMethods.getFourDigitNumber(randomNumber));
    }
}
