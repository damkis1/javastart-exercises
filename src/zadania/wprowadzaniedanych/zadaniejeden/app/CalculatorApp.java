package zadania.wprowadzaniedanych.zadaniejeden.app;

import zadania.wprowadzaniedanych.zadaniejeden.calc.Calculator;

class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printf("Wynik działania to: %.2f", calculator.allActions());
    }
}
