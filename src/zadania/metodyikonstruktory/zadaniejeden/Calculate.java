package zadania.metodyikonstruktory.zadaniejeden;
//Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double ,
// który będzie składał się z dwóch klas w osobnych plikach:
//
//Calculator.java - Klasa tu zdefiniowana powinna zawierać metody add(), subtract(),
// multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mnożenie i dzielenie.
// Zastanów się jakie argumenty powinny przyjmować oraz wartość jakiego typu powinny zwracać
//Calculate.java - tutaj umieść klasę testową z metodą main(). Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double,
// utwórz obiekt klasy Calculator i za jego pomocą oblicz wynik różnych działań matematycznych.
//Wszystkie wyniki działań wyświetl na ekranie.

class Calculate {
    public static void main(String[] args) {
        double a = 12.45;
        double b = 22.44;

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));

    }
}
