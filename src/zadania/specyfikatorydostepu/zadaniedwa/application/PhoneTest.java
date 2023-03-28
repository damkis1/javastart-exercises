package zadania.specyfikatorydostepu.zadaniedwa.application;

import zadania.specyfikatorydostepu.zadaniedwa.logic.Charger;
import zadania.specyfikatorydostepu.zadaniedwa.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        Charger charger = new Charger();
        System.out.println(telephone);

        for (int i = 0; i < 5; i++) {
            charger.charge(telephone);
        }

        System.out.println(telephone);
    }
}
