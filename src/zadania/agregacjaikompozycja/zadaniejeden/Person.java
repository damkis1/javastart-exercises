package zadania.agregacjaikompozycja.zadaniejeden;

class Person {
    String firstName;
    String lastName;
    String pesel;
    Address livingAddress;
    Address postalAddress;

    public Person(String firstName, String lastName, String pesel, Address livingAddress, Address postalAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.livingAddress = livingAddress;
        this.postalAddress = postalAddress;
    }

}