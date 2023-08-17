package zadania.agregacjaikompozycja.zadaniejeden;

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