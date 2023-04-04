package zadania.instrukcjesterujace.zadaniejeden.app;

import zadania.instrukcjesterujace.zadaniejeden.controller.PointController;
import zadania.instrukcjesterujace.zadaniejeden.data.Point;

import java.util.Scanner;

//Ćwiczenie
//W zadaniu wykorzystaj projekt z poprzedniego zadania (Specyfikatory dostępu i JavaBeans).
// W klasie PointApplication dodaj proste sterowanie, które pozwoli na zmianę wartości współrzędnych punktu w zależności od wybranej opcji.
//
//Stwórz dowolny punkt,
//zdefiniuj kilka możliwych opcji wyboru. Np. wartość 0 oznacza przesunięcie punktu o 1 w lewo, 1 przesunięcie punktu o 1 w prawo itd.
//wykorzystaj strukturę switch i w niej wywołaj odpowiednią metodę klasy PointController,
//wyświetl zmienione współrzędne punktu.
public class PointApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static PointController pointController = new PointController();

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
