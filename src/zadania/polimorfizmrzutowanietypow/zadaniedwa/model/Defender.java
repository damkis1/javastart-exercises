package zadania.polimorfizmrzutowanietypow.zadaniedwa.model;

public class Defender extends Figure {
    private double defenceBonus;

    public Defender(String name, double attack, double defence, double lifeEnergy, double defenceBonus) {
        super(name, attack, defence, lifeEnergy);
        this.defenceBonus = defenceBonus;
        setDefence(defence += (defence * defenceBonus));
    }

    public double getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(double defenceBonus) {
        this.defenceBonus = defenceBonus;
    }
}
