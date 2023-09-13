package zadania.klasastring.zadaniejeden;

import java.util.Random;

class Dice {
    private static final Random RANDOM = new Random();

    private final static String[] DICES_POINTS = {"""
             - - - - -
            |         |
            |    0    |
            |         |
             - - - - -
            """,
            """
             - - - - -
            | 0       |
            |         |
            |       0 |
             - - - - -
            """,
            """
             - - - - -
            | 0       |
            |    0    |
            |       0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |         |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |    0    |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            | 0     0 |
            | 0     0 |
             - - - - -
            """};

    static String drawTheNumber() {
        int side = RANDOM.nextInt(DICES_POINTS.length);
        return DICES_POINTS[side];
    }
}
