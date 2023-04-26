package zadania.enkapsulacja.zadaniedwa;

class CinemaSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("tytuł", "hottor", 128, 20, 300,300);
        Spectator spectator = new Spectator("Jan", "Kowalski", 19);
        Spectator spectator1 = new Spectator("Jan", "Kowaddcxxczlski", 21);
        Service service = new Service();

        service.ticketSalesValidation(movie, spectator);
        service.ticketSalesValidation(movie, spectator1);



    }
}
