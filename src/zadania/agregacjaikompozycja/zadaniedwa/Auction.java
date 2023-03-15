package zadania.agregacjaikompozycja.zadaniedwa;

class Auction {
    String title;
    String description;
    double price;
    Seller seller;

    public Auction(String title, String description,double price, Seller seller) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.seller = seller;
    }

    void auctionInfo(){
        System.out.println("Tytuł aukcji: " + title);
        System.out.println("Opis aukcji: " + description);
        System.out.println("Cena aukcji: " + price);
        System.out.println("Właścicel aukcji: " + seller.firstName + " " + seller.lastName);
    }
}
