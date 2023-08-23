package zadania.polimorfizmrzutowanietypow.zadaniejeden;

class Hospital {
    private static final int STAFF = 3;
    private Person [] people = new Person[STAFF];

    int staffCounter = 0;

    public Person[] getPeople() {
        return people;
    }

    void add(Person person){
        if (staffCounter == STAFF){
            System.out.println("Brak miejsca");
        }else {
            people[staffCounter] = person;
            staffCounter++;
        }
    }
}
