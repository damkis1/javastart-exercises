package zadania.agregacjaikompozycja.zadaniejeden;
//Do przykładu z kontem bankowym i kredytem, który przedstawiliśmy w lekcji,
// dodaj informacje o adresie (ulica, numer domu, numer mieszkania,
// miejscowość, kod pocztowy). Osoba ubiegająca się o konto lub kredyt w naszym banku powinna
// mieć teraz także przypisany adres zameldowania i zamieszkania. Oba te adresy mogą być różne lub takie same.
//
//Stwórz konto bankowe dla osoby, która ma identyczny adres zamieszkania i zameldowania oraz drugie konto dla osoby,
// która mieszka w innym miejscu niż jest zameldowana. Obie te osoby mieszkają pod tym samym adresem.
//
//Wyświetl informację o imieniu, nazwisku i miejscowości zamieszkania każdej osoby oraz o ilości środków
// na koncie każdej z tych osób.
//
//Na kartce lub w dowolnym programie graficznym narysuj także uproszczony model pamięci uwzględniający wszystkie
// referencje i obiekty w twojej aplikacji.
class Bank {
    public static void main(String[] args) {
        Address firstPersonAddress = new Address("Krakowska",1,2,"Rzeszów",
                "35-200");

        Person firstPerson = new Person("Jan", "Kowalski", "123456789", firstPersonAddress, firstPersonAddress);
        BankAccount firstPersonBankAccount = new BankAccount(firstPerson,10000);


        Address secondPersonLivingAddress = new Address("Warszawska",2,3,
                "Nosówka","22-222");
        Address secondPersonPostalAddress = new Address("Gdańska",4,5,"Warszawa",
                "20-200");
        Person secondPerson = new Person("Jaina","Nowak","987654321", secondPersonLivingAddress,
                secondPersonPostalAddress);
        BankAccount secondPersonBankAccount = new BankAccount(secondPerson, 20000);

        System.out.println("Pierwsza osoba: ");
        firstPersonBankAccount.bankAccountInfo();
        System.out.println("Druga osoba: ");
        secondPersonBankAccount.bankAccountInfo();
    }

}