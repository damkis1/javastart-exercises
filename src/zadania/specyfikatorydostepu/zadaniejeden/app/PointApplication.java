package zadania.specyfikatorydostepu.zadaniejeden.app;

import zadania.specyfikatorydostepu.zadaniejeden.data.Point;
import zadania.specyfikatorydostepu.zadaniejeden.controller.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        PointController pointController = new PointController();

        pointController.addX(point);
        pointController.addY(point);

        System.out.println(point);

        pointController.minusX(point);
        pointController.minusY(point);

        System.out.println(point);
    }
}
