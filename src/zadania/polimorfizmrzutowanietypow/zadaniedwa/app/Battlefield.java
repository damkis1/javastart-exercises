package zadania.polimorfizmrzutowanietypow.zadaniedwa.app;

import zadania.polimorfizmrzutowanietypow.zadaniedwa.model.Attacker;
import zadania.polimorfizmrzutowanietypow.zadaniedwa.model.Defender;
import zadania.polimorfizmrzutowanietypow.zadaniedwa.model.Figure;
import zadania.polimorfizmrzutowanietypow.zadaniedwa.model.Team;

class Battlefield {
    public static void main(String[] args) {

        Figure figurePL1 = new Attacker("Józef P", 100, 100, 100, 0.2);
        Figure figurePL2 = new Defender("Husarz Obronny", 100, 100, 100, 0.2);
        Figure figurePL3 = new Attacker("Husarz Atakujący", 100, 100, 100, 0.2);
        Team team1 = new Team("Polska guuuuuuuuurom", figurePL1, figurePL2, figurePL3);

        Figure figureRU1 = new Attacker("Józef S", 100, 100, 100, 0.2);
        Figure figureRU2 = new Defender("Czerwony Obrońca", 100, 100, 100, 0.2);
        Figure figureRU3 = new Attacker("Czerwony Atakujący", 100, 100, 100, 0.2);
        Team team2 = new Team("Ruskieeeeeeeee", figureRU1, figureRU2, figureRU3);

        Battle.resultOfBattle(team1, team2);

    }
}
