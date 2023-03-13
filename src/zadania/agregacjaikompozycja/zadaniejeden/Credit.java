package zadania.agregacjaikompozycja.zadaniejeden;

class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;



    public Credit(Person borrower, double cashBorrowed, double cashReturned, double interestRate, int termMonths) {
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

}