package zadania.tablicejednowymiarowe.zadaniejeden;
//Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego.
// Każda z nich powinna przechowywać po 3 dowolne liczby typu int. Program powinien wyświetlić sumę wszystkich liczb z obu tablic.
//
//Następnie zdefiniuj metodę, która realizuje to samo zadanie, czyli przyjmuje dwie tablice, a zwraca sumę wszystkich ich elementów.
class Main {
    public static void main(String[] args) {
        int [] first = {1, 2, 3};
        int [] second = {4, 5, 6};
        System.out.println(sum(first, second));
    }
    static int sum (int [] first, int [] second){
        int sum1 = 0;
        for (int i = 0; i < first.length; i++) {
            sum1 += first[i];
        }

        int sum2 = 0;
        for (int i = 0; i < second.length; i++) {
            sum2 += second[i];
        }
        return  sum1 + sum2;
    }
}
