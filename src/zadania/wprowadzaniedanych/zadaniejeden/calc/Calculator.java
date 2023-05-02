package zadania.wprowadzaniedanych.zadaniejeden.calc;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    private double addition(double a, double b){
        return a + b;
    }

    private double subtraction(double a, double b){
        return a - b;
    }

    private double multiplication(double a, double b){
        return a * b;
    }

    private double division(double a, double b){
        return a / b;
    }

    private void menu(){
        String menuStr = """
                Jakie działanie chcesz wykonać?
                Jeśli dodawanie wciśnił: +
                Jeśli odejmowanie wciśnij: -
                Jeśli mnożenie wciśnij: *
                Jeśli dzielenie wćisnij: /""";
        System.out.println(menuStr);
    }
    public double allActions(){
        menu();
        String sign = scanner.nextLine();
        System.out.println("Podaj pierwszą liczbę");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double b = scanner.nextDouble();
        scanner.close();
        double result = 0;
        switch (sign){
            case "+" -> result = addition(a,b);
            case "-" -> result = subtraction(a,b);
            case "*" -> result = multiplication(a,b);
            case "/" -> result = division(a, b);
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        }
        return result;
    }
}
