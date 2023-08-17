package zadania.petle.zadaniedwa;

import java.util.Scanner;
//Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:
//
//Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL). Klasa powinna być zgodna z konwencją JavaBeans,
//Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów,
//HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta,
// 2 - wyświetlenie listy zapisanych pacjentów.
//Ograniczenia:
//
//Do szpitala może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana jest informacja o tym,
// że limit został już wyczerpany.
//Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.
class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        boolean flag = true;
        String options = """
                0 - wyjście z programu
                1 - dodanie pacjenta
                2 - wyświetlenie aktualnych pacjentów""";
        while (flag){
            System.out.println(options);
            int menu = scanner.nextInt();
            if (menu == 0){
                flag = false;
            } else if (menu == 1){
                hospital.addPatient();
            } else if (menu == 2) {
                hospital.showAllPatients();
            }
        }
        scanner.close();
    }
}
