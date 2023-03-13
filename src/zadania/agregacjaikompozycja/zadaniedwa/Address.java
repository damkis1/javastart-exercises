package zadania.agregacjaikompozycja.zadaniedwa;

public class Address {
    String city;
    String postCode;
    String street;
    int homeNo;
    int flatNo;

    public Address() {
    }

    public Address(String city, String postCode, String street, int homeNo, int flatNo) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }
}
