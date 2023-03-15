package zadania.metodyikonstruktory.zadaniecztery;

class House {
    private double amountOfWater;
    private double amountOfOil;

    public House(double amountOfWater, double amountOfOil) {
        this.amountOfWater = amountOfWater;
        this.amountOfOil = amountOfOil;
    }

    public double getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(double amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public double getAmountOfOil() {
        return amountOfOil;
    }

    public void setAmountOfOil(double amountOfOil) {
        this.amountOfOil = amountOfOil;
    }

    void takeShower() {
        System.out.println("Bierzemy prysznić");
        amountOfWater -= 48;
        printInfo();
    }

    void takeBath() {
        System.out.println("Bierzemy kąpiel");
        amountOfWater -= 86;
        printInfo();
    }

    void makeDinner() {
        System.out.println("Robimy obiad");
        amountOfOil -= 0.1;
        amountOfWater -= 4;
        printInfo();
    }

    void boilWater() {
        System.out.println("Gortujemy wodę");
        amountOfOil -= 0.05;
        amountOfWater -= 0.5;
        printInfo();
    }

    void watchTv(int hours) {
        System.out.println("Oglądamy telewizję");
        amountOfOil -= (hours * 0.06);
        printInfo();
    }

    void printInfo() {
        System.out.printf("Ilość wody: %.2f " + "Ilość oleju: %.2f\n", amountOfWater, amountOfOil);
    }
}
