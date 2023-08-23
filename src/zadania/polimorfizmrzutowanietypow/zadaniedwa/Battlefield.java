package zadania.polimorfizmrzutowanietypow.zadaniedwa;

class Battlefield {
    public static void main(String[] args) {
        Figure[] firstTeam = new Figure[3];
        Figure[] secondTeam = new Figure[3];

        firstTeam[0] = new Attacker("Józef P", 100, 100, 100, 0.2);
        firstTeam[1] = new Defender("Husarz Obronny", 100, 100, 100, 0.2);
        firstTeam[2] = new Attacker("Husarz Atakujący", 100, 100, 100, 0.2);

        secondTeam[0] = new Attacker("Józef S", 100, 100, 100, 0.2);
        secondTeam[1] = new Defender("Czerwony Obrońca", 100, 100, 100, 0.2);
        secondTeam[2] = new Attacker("Czerwony Atakujący", 100, 100, 100, 0.2);

        double secondTeamLifeAfterBattle = battle(firstTeam, secondTeam);

        double firstTeamLifeAfterBattle = battle(secondTeam, firstTeam);


        resultOfBattle(firstTeamLifeAfterBattle, secondTeamLifeAfterBattle);

    }

    private static double battle(Figure[] attackers, Figure[] defences) {
        double attack = attackSum(attackers);
        double defence = defenceSum(defences);
        double attackAfterDefence = attack - defence;

        double defencesEnergy = energySum(defences);

        if (defence > attack)
            return defencesEnergy;
        else
            return attackAfterDefence - defencesEnergy;
    }

    private static void resultOfBattle(double firstTeamLife, double secondTeamLife) {
        if (firstTeamLife > secondTeamLife) {
            System.out.println("First Team win");
        } else if (secondTeamLife > firstTeamLife) {
            System.out.println("Second Team win");
        } else System.out.println("Draw");
    }

    private static double attackSum(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getAttack();
        }
        return sum;
    }

    private static double defenceSum(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getDefence();
        }
        return sum;
    }

    private static double energySum(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getLifeEnergy();
        }
        return sum;
    }
}
