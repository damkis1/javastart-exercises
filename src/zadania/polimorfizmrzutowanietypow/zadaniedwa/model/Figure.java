package zadania.polimorfizmrzutowanietypow.zadaniedwa.model;

public class Figure {
    private String name;
    private double attack;
    private double defence;
    private double lifeEnergy;

    public Figure(String name, double attack, double defence, double lifeEnergy) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.lifeEnergy = lifeEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getLifeEnergy() {
        return lifeEnergy;
    }

    public void setLifeEnergy(double lifeEnergy) {
        this.lifeEnergy = lifeEnergy;
    }
}
