package zadania.wyjatki.zadaniejeden;

class Calculator {
    private static final Entry ENTRY = new Entry();

    private double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double division(double firstNumber, double secondNumber) {
        if (secondNumber == 0)
            throw new  ArithmeticException("Nie dziel cholero nigdy przez zero");
        return firstNumber / secondNumber;
    }

    double calculate() throws UnknownOperatorException {
        System.out.println("Wybierz pierwszą liczbę");
        double firstNumber = ENTRY.selectNumber();
        ENTRY.cleanScanner();
        System.out.println("Wprowadź znak działania");
        String sign = ENTRY.selectSign();
        System.out.println("Wybierz drugą liczbę");
        double secondNumber = ENTRY.selectNumber();
        return switch (sign) {
            case "+" -> addition(firstNumber, secondNumber);
            case "-" -> subtraction(firstNumber, secondNumber);
            case "*" -> multiplication(firstNumber, secondNumber);
            case "/" -> division(firstNumber, secondNumber);
            default -> throw new UnknownOperatorException("Błędny znak");
        };
    }
}
