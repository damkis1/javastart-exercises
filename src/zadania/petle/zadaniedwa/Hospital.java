package zadania.petle.zadaniedwa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hospital {
    private final int maxPatientsNumber = 10;
    private static Scanner scanner = new Scanner(System.in);
    Patient patient;
    private Patient [] patients = new Patient[maxPatientsNumber];

    int counter = 0;

    public void addPatient() {
        if (counter == 10) {
            System.out.println("nie można dodać kolejnego pacjenta");
        } else {
            System.out.println("Podaj imie pacienta");
            String firstName = scanner.nextLine();
            System.out.println("Podaj naziwsko");
            String lastName = scanner.nextLine();
            System.out.println("Podaj pesel");
            String pesel = scanner.nextLine();
            patients[counter] = new Patient(firstName, lastName, pesel);
            counter++;
        }
    }

    public void showAllPatients(){
        for (int i = 0; i < counter; i++) {
            System.out.println("Numer: " + (i + 1) + " " + patients[i]);
        }
    }
}
