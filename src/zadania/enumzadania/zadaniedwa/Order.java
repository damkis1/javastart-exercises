package zadania.enumzadania.zadaniedwa;

class Order {
    private String item;
    private double price;
    private Status status;

    public Order(String item, double price, Status status) {
        this.item = item;
        this.price = price;
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return item + " " + "(" + price + ") - " + status.getDescription();
    }
}
