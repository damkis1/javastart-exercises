package zadania.konstrukcjasuper.zadaniejeden;

class Shop {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(220, "jabłkowaty");
        System.out.println(fruit.getInfo());

        Apple apple = new Apple(220, "polskie");
        System.out.println(apple.getInfo());
    }
}
