package zadania.metodyikonstruktory.zadaniecztery;
//Niektóre domy budowane są w centrach miast,
// a inne na całkowitych odludziach. Te drugie nie zawsze mają przyłączenia do sieci kanalizacyjnej,
// czy energetycznej i dlatego mają własne zapasy wody oraz paliwa, do wytwarzania prądu. To właśnie nimi zajmiemy się w tym ćwiczeniu.
//
//Zdefiniuj klasę, która reprezentuje dom. Klasa ta powinna odzwierciedlać poziom zasobów, którymi dysponujemy. Te zasoby to:
//
//ilość wody, podana w litrach,
//ilość ropy, podana w litrach.
//Ropa jest nam potrzebna do napędzania agregatu prądotwórczego, który zasila wszelkie sprzęty, takie jak telewizor,
// kuchnia elektryczna, czy czajnik elektryczny.
//
//W klasie powinien być konstruktor, który pozwoli ustawić oba pola podczas tworzenia obiektu.
//
//Oprócz tego w klasie powinno być wiele różnych metod, które odpowiadają codziennym aktywnościom i wpływają na zmniejszanie się zasobów:
//
//takeShower() - metoda która odpowiada wzięciu prysznica przez 1 osobę. Jeden prysznic powoduje zużycie 48 litrów wody.
//takeBath() - metoda, która odpowiada pojedynczej kąpieli. Jedna kąpiel powoduje zużycie 86 litrów wody.
//makeDinner() - metoda, która symuluje ugotowanie obiadu. Operacja ta powoduje zużycie 0,1L ropy (do wytworzenia prądu) i 4L wody.
//boilWater() - metoda, która symuluje ugotowanie wody w czajniku elektrycznym. Operacja ta powoduje zużycie 0,05L ropy
// (do wytworzenia prądu) oraz 0,5 litra wody (taka jest pojemność czajnika).
//watchTv() - metoda, która przyjmuje jako parametr liczbę godzin, przez jaką oglądaliśmy telewizję. Oglądanie telewizora przez 1 godzinę,
// powoduje zużycie 0,06L ropy (do wytworzenia prądu). Zakładamy, że zawsze telewizor oglądamy licząc w pełnych godzinach.
//Dodatkowo zdefiniuj metodę, która w wyniku zwróci opis ze stanem zasobów w domu.
//
//Utwórz obiekt reprezentujący dom z dowolnym poziomem zasobów. Przetestuj działanie metod, wyświetlając po każdej operacji
// stan zasobów w domu.

class Life {
    public static void main(String[] args) {
        House house = new House(1000,30);
        house.printInfo();
        house.takeShower();
        house.takeBath();
        house.makeDinner();
        house.boilWater();
        house.watchTv(5);
    }
}
