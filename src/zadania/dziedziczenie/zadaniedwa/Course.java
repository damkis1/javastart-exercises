package zadania.dziedziczenie.zadaniedwa;

class Course {
    private String id;
    private double price;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
