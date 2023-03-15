package zadania.przeciazaniemetodithis.zadaniejeden;
//Ćwiczenie
//Napisz program - kalkulator, który będzie składał się z dwóch klas:
//
//Calculator,
//CalcTest.
//W klasie Calculator zdefiniuj metody add (dodaj) i subtract (odejmij) w kilku przeciążonych wersjach,
// aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.
//
//W klasie CalcTest przetestuj działanie klasy Calculator.

class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 4));
        System.out.println(calculator.add(4, 4,6));
        System.out.println(calculator.add(4.24, 4.67));
        System.out.println(calculator.add(3.55, 6.88,7.01));
        System.out.println(calculator.subtract(5, 1));
        System.out.println(calculator.subtract(5, 1,4));
        System.out.println(calculator.subtract(5.33, 1.55));
        System.out.println(calculator.subtract(5.44, 1.66, 6.78));
    }
}
