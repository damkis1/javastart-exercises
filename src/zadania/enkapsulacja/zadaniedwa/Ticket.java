package zadania.enkapsulacja.zadaniedwa;

class Ticket {
   private int ticketId;
   private String ticketPersonData;
   private String ticketMovieTitle;

    public Ticket() {
    }

    public Ticket(int ticketId, String ticketPersonData, String ticketMovieTitle) {
        this.ticketId = ticketId;
        this.ticketPersonData = ticketPersonData;
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(String ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getTicketMovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicketMovieTitle(String ticketMovieTitle) {
        this.ticketMovieTitle = ticketMovieTitle;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", ticketPersonData='" + ticketPersonData + '\'' +
                ", ticketMovieTitle='" + ticketMovieTitle + '\'' +
                '}';
    }
}
