package zadania.metody.zadaniedwa;
//Stwórz aplikację, która będzie służyła do przeliczania jednostek.
// Zdefiniuj klasę, która będzie posiadała metody do przeliczania jednostek metrycznych:
//
//metrów na centymetry
//metrów na milimetry
//centymetrów na metry
//milimetrów na metry
//W kolejnej klasie zdefiniuj metody związane z przeliczaniem czasu:
//
//godzin na minuty
//minut na sekundy
//sekund na milisekundy
//Zakładamy, że w przypadku jednostek czasu operujemy jedynie na wartościach całkowitych,
// czyli np. nie będziemy przeliczali "pół godziny na minuty".
//
//W osobnej klasie przetestuj działanie stworzonych metod.
//
//Korzystając ze zdefiniowanych metod przelicz np. 14 godzin na milisekundy.

public class Converter {
    public static void main(String[] args) {
        MetricUnits metricUnits = new MetricUnits();
        System.out.println(metricUnits.metersToCentimeters(24.5));
        System.out.println(metricUnits.metersToMillimeters(24.5));
        System.out.println(metricUnits.centimetersToMeters(24.5));
        System.out.println(metricUnits.millimetersToMeters(240.5));

        TimeUnits timeUnits = new TimeUnits();
        System.out.println(timeUnits.hoursToMinutes(4));
        System.out.println(timeUnits.minutesToSeconds(3));
        System.out.println(timeUnits.secondsToMilliseconds(34));
    }
}
