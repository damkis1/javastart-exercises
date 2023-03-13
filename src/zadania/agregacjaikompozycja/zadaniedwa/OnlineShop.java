package zadania.agregacjaikompozycja.zadaniedwa;

public class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address("Wrocław","33-333","Jakaś",1,2);
        Seller seller1 = new Seller("Jan","Kowalski",address);
        Auction auction1 = new Auction("Xbox", "Dlalalalala",3000, seller1);

        Seller seller2 = new Seller("Justyna","Adamczyk", new Address());
        Auction auction2 = new Auction("Play", "ohojjooj",2000, seller2);

        auction1.auctionInfo();
        auction2.auctionInfo();
    }
}
