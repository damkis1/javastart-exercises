package zadania.polimorfizmrzutowanietypow.zadaniedwa.model;

public class Team {
    private String name;
    private Figure [] figures = new Figure[3];

    public Team(String name, Figure one, Figure two, Figure three) {
        this.name = name;
        this.figures[0] = one;
        this.figures[1] = two;
        this.figures[2] = three;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }

    public double attackSum() {
        double attack = 0;
        for (Figure figure : figures) {
            attack += figure.getAttack();
        }
        return attack;
    }

   public double energySum() {
        double energy = 0;
        for (Figure figure : figures) {
            energy += figure.getLifeEnergy();
        }
        return energy;
    }

    public double defenceSum() {
        double defence = 0;
        for (Figure figure : figures) {
            defence += figure.getDefence();
        }
        return defence;
    }
}
