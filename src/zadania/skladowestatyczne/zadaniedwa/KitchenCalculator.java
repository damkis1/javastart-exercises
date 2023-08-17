package zadania.skladowestatyczne.zadaniedwa;

class KitchenCalculator {
    static final double GLASS_TO_ML = 250;
    static final double SPOON_TO_ML = 15;
    static final double TEASPOON_TO_ML = 5;
    public static double glassesToMilliliters(double glass){
        return glass * GLASS_TO_ML;
    }
    public static double spoonsToMilliliters(double spoon){
        return spoon * SPOON_TO_ML;
    }
    public static double teaspoonsToMilliliters(double teaspoon){
        return teaspoon * TEASPOON_TO_ML;
    }
}
