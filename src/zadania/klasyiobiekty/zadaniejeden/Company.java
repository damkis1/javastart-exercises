package zadania.klasyiobiekty.zadaniejeden;

class Company {
    //Napisz program, w którym utworzysz dwie klasy:
    //
    //Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy.
    // Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,
    //Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników,
    // a następnie wyświetlisz informację o nich na ekranie.

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalksi", 1986, 37);
        Employee employee2 = new Employee("Janina", "Kowalska", 1976, 47);
        Employee employee3 = new Employee("Marcyś", "Blabla", 1990, 4);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
