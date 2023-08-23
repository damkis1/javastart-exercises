package zadania.polimorfizmrzutowanietypow.zadaniedwa;

class Attacker extends Figure {
    private double attackBonus;

    public Attacker(String name, double attack, double defence, double lifeEnergy, double attackBonus) {
        super(name, attack, defence, lifeEnergy);
        this.attackBonus = attackBonus;
        setAttack(attack += (attack * attackBonus));
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }
}
