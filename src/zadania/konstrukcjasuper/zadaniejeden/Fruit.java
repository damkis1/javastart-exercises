package zadania.konstrukcjasuper.zadaniejeden;

class Fruit {
    private int weight;
    private String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }
    public String getInfo(){
        return String.format("Waga: %dg, typ: %s", weight, type);
    }
}
