package zadania.wyjatki.zadaniedwa;

import java.util.InputMismatchException;

class CompetitionApp {
    public static void main(String[] args) {
        CompetitionController competitionController = new CompetitionController();
        try {
            competitionController.run();
        }catch (InputMismatchException e){
            System.err.println("Wprowadziłeś napis zamiast liczby");
        }
    }
}