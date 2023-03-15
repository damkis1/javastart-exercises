package zadania.operacjenazmiennych.zadaniejeden;

import java.util.Random;

//Napisz program, w którym zadeklarujesz dwie zmienne typu
// int o nazwach x oraz y. Przypisz do nich dowolne liczby,
// a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:
//
//1.Czy x jest większe od y?
//2.Czy x pomnożone przez 2 jest większe od y?
//3.Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
//4.Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
//Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.
class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        int y = random.nextInt(101);

        boolean isBigger1 = x > y;
        boolean isBigger2 = (x * 2) > y;
        boolean isBigger3 = y < (x + 3) && y > (x - 2);
        boolean isEven = (x * y) % 2 == 0;

        System.out.printf("\"x\" to: %d a \"y\" to: %d\n", x, y);
        System.out.printf("Odp 1 to: %b, odp 2 to: %b, odp 3 to: %b, i odp 4 to: %b\n",
                isBigger1, isBigger2, isBigger3, isEven);
    }
}
