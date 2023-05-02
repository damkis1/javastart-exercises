package zadania.tablicejednowymiarowe.zadaniedwa;

public class ElevatorApp {
    public static void main(String[] args) {
        Person person = new Person(1, 300);
        Person person1 = new Person(2, 50);

        Elevator elevator = new Elevator();
        elevator.add(person);
        elevator.add(person1);
        elevator.add(person1);

        elevator.showPeople();

        elevator.start();

        elevator.clear();

        elevator.showPeople();

        elevator.add(person);
        elevator.add(person1);

        elevator.showPeople();
        elevator.start();

    }
}
