package zadania.przeciazaniemetodithis.zdaniedwa;

import java.util.Random;

public class Dice {
    Random random = new Random();
    private int wall;

    public Dice() {
        roll();
    }

    public Dice(int wall) {
        this.wall = wall;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }
    void roll(){
        setWall(random.nextInt(1,7));
    }
    void printInfo(){
        System.out.println("Liczba oczek to: " + getWall());
    }
}
