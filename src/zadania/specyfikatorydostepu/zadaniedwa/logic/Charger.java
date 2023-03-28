package zadania.specyfikatorydostepu.zadaniedwa.logic;

import zadania.specyfikatorydostepu.zadaniedwa.model.Telephone;

public class Charger {
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
