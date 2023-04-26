package zadania.enkapsulacja.zadaniedwa;

public class Service {
    private Movie movie;
    private Spectator spectator;
    private Ticket ticket;


    public void ticketSalesValidation(Movie movie, Spectator spectator) {
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (spectator.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
        } else {
            Ticket ticket = createTicket(movie, spectator);
            showTicketInfo(ticket, movie);
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            roomStatus(movie);
            System.out.println();
        }
    }

    private Ticket createTicket(Movie movie, Spectator spectator) {
        int ticketId = (movie.getMaxSeats() - movie.getFreeSeats() + 1);
        String personData = spectator.getFirstName() + " " + spectator.getLastName();
        String movieTitle = movie.getMovieTitle();
        return new Ticket(ticketId, personData, movieTitle);
    }


    private void showTicketInfo(Ticket ticket, Movie movie) {
        if (ticket.getTicketId() != 0) {
            System.out.println(ticket.getTicketId() + " | " + ticket.getTicketPersonData() + " | "
                    + ticket.getTicketMovieTitle() + "  -  " + movie.getMovieType() + " - " + movie.getMovieTime() + "min");
        }
    }

    private void roomStatus(Movie movie){
        System.out.println("Liczba pozostałych miejsc: " + movie.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie.getMaxSeats() - movie.getFreeSeats()));
    }
}
