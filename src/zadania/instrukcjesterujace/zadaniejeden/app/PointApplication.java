package zadania.instrukcjesterujace.zadaniejeden.app;

import zadania.instrukcjesterujace.zadaniejeden.controller.PointController;
import zadania.instrukcjesterujace.zadaniejeden.data.Point;

import java.util.Scanner;
public class PointApplication {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PointController pointController = new PointController();

    public static void main(String[] args) {
        Point point = new Point(5, 5);
        options(point);
        System.out.println(point);
    }
    private static void options(Point point) {
        System.out.println("""
                1: przesuń X w prawo
                2: przesuń X w lewo
                3: przesuń Y do góry
                4: przesuń Y w dół""");
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> pointController.addX(point);
            case 2 -> pointController.minusX(point);
            case 3 -> pointController.addY(point);
            case 4 -> pointController.minusY(point);
            default -> System.out.println("Brak opcji");
        }
    }
}
