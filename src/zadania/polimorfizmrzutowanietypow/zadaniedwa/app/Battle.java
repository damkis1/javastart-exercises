package zadania.polimorfizmrzutowanietypow.zadaniedwa.app;

import zadania.polimorfizmrzutowanietypow.zadaniedwa.model.Team;

class Battle {
    private static double attack(Team attackers, Team defences) {
        double attack = attackers.attackSum();
        double defence = defences.defenceSum();
        double attackAfterDefence = attack - defence;


        if (defence > attack)
            return defences.energySum();
        else
            return defences.energySum() - attackAfterDefence;
    }

    public static void resultOfBattle(Team one, Team two) {
        double secondTeamLifeAfterBattle = attack(one, two);
        double firstTeamLifeAfterBattle = attack(two, one);
        if (firstTeamLifeAfterBattle > secondTeamLifeAfterBattle) {
            System.out.printf("Win the team called - %s", one.getName());
        } else if (secondTeamLifeAfterBattle > firstTeamLifeAfterBattle) {
            System.out.printf("Win the team called - %s", two.getName());
        } else System.out.println("Draw");
    }
}
