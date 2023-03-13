package zadania.klasyiobiekty.zadanietrzy;

//Projektujemy aplikację do automatycznego podlewania naszego ogródka.
//
//Pierwszą rzeczą, która będzie nam potrzebna jest klasa reprezentująca pojedynczą roślinę.
// Każda roślina ma swoją nazwę, opis oraz informację o dziennym zapotrzebowaniu na wodę (np. 1litr, albo 0.2 litra itp.).
//
//W osobnej klasie stwórz kilka obiektów reprezentujących rośliny (co najmniej 3) i wyświetl na ekranie następujące statystyki:
//
//dzienne zużycie wody przez wszystkie rośliny,
//tygodniowe zużycie wody,
//roczne zużycie wody (365 dni).
public class Statistics {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Kaktus","Mało pije wody, ładny jest",0.2);
        Plant plant2 = new Plant("Róża","Na dole róże na górze bez",2.5);
        Plant plant3 = new Plant("Sosna","Sosna to jest to",12.7);

        double allPlantsWaterADay = plant1.getWaterADay() + plant2.getWaterADay() + plant3.getWaterADay();
        double allPlantsWaterAWeek = allPlantsWaterADay * 7;
        double allPlantsWaterAYear = allPlantsWaterADay * 365;

        System.out.printf("Zużycie (wszystkich roślin) wody na dzień: %.2f, tydzień: %.2f, raz rok: %.2f",
                allPlantsWaterADay, allPlantsWaterAWeek, allPlantsWaterAYear);
    }
}
