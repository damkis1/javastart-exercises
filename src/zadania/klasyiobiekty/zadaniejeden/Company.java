package zadania.klasyiobiekty.zadaniejeden;

class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalksi", 1986, 37);
        Employee employee2 = new Employee("Janina", "Kowalska", 1976, 47);
        Employee employee3 = new Employee("Marcyś", "Blabla", 1990, 4);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
