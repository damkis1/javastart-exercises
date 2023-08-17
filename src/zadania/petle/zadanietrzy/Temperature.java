package zadania.petle.zadanietrzy;

import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj aktualną temperature");
        double actualTemperature = scanner.nextDouble();
        System.out.println("Podaj oczekiwaną temperaturę");
        int expectedTemperature = scanner.nextInt();
        if (actualTemperature < expectedTemperature){
            while (actualTemperature < expectedTemperature){
                System.out.println("Aktualna temperatura to " + actualTemperature);
                actualTemperature += 0.5;
            }
        } else if (actualTemperature > expectedTemperature) {
            while (actualTemperature > expectedTemperature){
                System.out.println("Aktualna temperatura to " + actualTemperature);
                actualTemperature -= 0.5;
            }
        }
        System.out.println("Osiągnięto temperaturę " + actualTemperature);
    }
}
