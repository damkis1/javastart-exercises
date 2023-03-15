package zadania.przeciazaniemetodithis.zdaniedwa;

public class Casino {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.printInfo();
        dice.roll();
        dice.printInfo();
        Dice dice1 = new Dice(6);
        dice1.printInfo();
    }
}
