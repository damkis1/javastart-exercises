package zadania.agregacjaikompozycja.zadaniejeden;

class BankAccount {
    Person owner;
    double balance;

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void bankAccountInfo(){
        System.out.println(owner.firstName + " " + owner.lastName);
        System.out.println("Mieszka w miejscowości: " + owner.livingAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + balance);
        System.out.println();
    }
}
