package zadania.polimorfizmrzutowanietypow.zadaniejeden;

class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Person doctor = new Doctor("Damian", "Kis",600000,130000);
        Person nurse1 = new Nurse("Jadzia","Wsadzi",3000,60);
        Person nurse2 = new Nurse("Stasia","Władzi",6000,30);
        hospital.add(doctor);
        hospital.add(nurse1);
        hospital.add(nurse2);

        for (Person person : hospital.getPeople()) {
            System.out.println(person.getInfo());
        }
    }
}
