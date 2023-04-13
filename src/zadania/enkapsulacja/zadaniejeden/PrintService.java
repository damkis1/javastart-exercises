package zadania.enkapsulacja.zadaniejeden;

class PrintService {
    private Client client;


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void printSummary(Client client, double price, double discountPrice) {
        printWelcomeMessage(client);
        priceInfo(price, discountPrice);
    }

    private void priceInfo(double price, double discountPrice) {
        System.out.printf("Cena produktu który wybrałeś przed obniżką to %.2f\n", price);
        System.out.printf("Cena po obniżce to %.2f\n", discountPrice);
    }

    private static void printWelcomeMessage(Client client) {
        if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.printf("Witaj %s\n", client.getFirstName());
        } else if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.printf("Witaj panie/pani %s\n", client.getLastName());
        } else if (client.getFirstName() == null && client.getLastName() == null) {
            System.out.println("Witaj nieznajomy/nieznajoma");
        } else System.out.printf("Witaj %s %s\n", client.getFirstName(), client.getLastName());
    }
}
