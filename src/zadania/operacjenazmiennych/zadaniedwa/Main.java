package zadania.operacjenazmiennych.zadaniedwa;

import java.util.Scanner;

//Ceny produktów w sklepach wyrażane są jako kwoty brutto. Na cenę taką składa się cena netto oraz podatek VAT.
// Przykładowo jeżeli cena netto produktu wynosi 100zł,
// a podatek VAT dla tego towaru wynosi 23%, to cena brutto wyniesie 123zł, ponieważ 100 + 100*0,23 = 123.
//
//Napisz program, w którym do zmiennej przypiszesz liczbę, która będzie oznaczała cenę netto pewnego towaru.
// Do drugiej zmiennej przypisz wartość, która będzie wyrażała wysokość stawki VAT
// (np. 0.23 będzie odpowiadało stawce 23% VAT).
//
//Przypisz do zmiennych przykładowe wartości, a następnie oblicz i wyświetl kwotę netto,
// wysokość podatku VAT dla tego produktu, oraz kwotę brutto do zapłaty za towar.
// Możesz definiować w programie dowolne dodatkowe zmienne, jeżeli uznasz to za pomocne.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu");
        String nazwa = scanner.next();
        System.out.println("i jego cene");
        double brutto = scanner.nextDouble();
        kalkulator(nazwa,brutto);
        scanner.close();
    }
    public static void kalkulator(String nazwaProduktu, double cennaBrutto){
        double cenaNetto = cennaBrutto / 1.23;
        double kwotaPodatku = cennaBrutto - cenaNetto;
        System.out.printf("%s kosztuje brutto: %f, netto: %f, natomiast" +
                "podatek wyniósł: %f:", nazwaProduktu, cennaBrutto, cenaNetto, kwotaPodatku);
    }
}
