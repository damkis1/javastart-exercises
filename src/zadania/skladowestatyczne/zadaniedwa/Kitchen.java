package zadania.skladowestatyczne.zadaniedwa;

class Kitchen {
    public static void main(String[] args) {
        double teaspoons = KitchenCalculator.teaspoonsToMilliliters(1.5);
        double spoons = KitchenCalculator.spoonsToMilliliters(2.5);
        double glasses = KitchenCalculator.glassesToMilliliters(4.3);

        System.out.printf("Do przepisu potrzeba %.2f ml z łyżeczki, %.2f ml z łyżki, oraz %.2f ml ze szklanki", teaspoons
        ,spoons, glasses);
    }
}
