package zadania.enkapsulacja.zadaniejeden;

class DiscountApp {
    public static void main(String[] args) {
        Client client = new Client("Damian", "this.Damian", true);
        double price = 2000;

        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client, price);

        PrintService printService = new PrintService();
        printService.printSummary(client, price, discountPrice);
    }
}
