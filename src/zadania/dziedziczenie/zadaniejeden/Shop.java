package zadania.dziedziczenie.zadaniejeden;

class Shop {
    public static void main(String[] args) {
        Tire tire = new Tire();
        tire.setId(01);
        tire.setProducer("Michałek");
        tire.setModel("taki duży");
        tire.setSeries("pierwsza");
        tire.setWidth(14);
        tire.setSize(2);

        ExhaustPart exhaustPart = new ExhaustPart();
        exhaustPart.setId(2);
        exhaustPart.setProducer("wydechowo");
        exhaustPart.setModel("fajny");
        exhaustPart.setSeries("najlepsza");
        exhaustPart.setEuropeanExhaustStandard(true);

        System.out.println(exhaustPart);
    }
}
