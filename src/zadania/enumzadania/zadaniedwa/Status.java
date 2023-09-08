package zadania.enumzadania.zadaniedwa;

enum Status {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone"),
    CANCELLED("Anulowane");

    private final String description;

    public String getDescription() {
        return description;
    }

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
