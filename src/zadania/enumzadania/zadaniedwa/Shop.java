package zadania.enumzadania.zadaniedwa;

import java.util.Scanner;

class Shop {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Order[] orders = createOrders();
        allStatuses();
        Status status = getStatus();
        printOrders(orders, status);

    }

    private static Order[] createOrders() {
        Order [] orders = new Order[7];
        orders[0] = new Order("Komputer", 2000, Status.NEW);
        orders[1] = new Order("Komputer1", 2001, Status.CANCELLED);
        orders[2] = new Order("Komputer2", 2004, Status.CANCELLED);
        orders[3] = new Order("Komputer3", 2005, Status.NEW);
        orders[4] = new Order("Komputer4", 2006, Status.SHIPPED);
        orders[5] = new Order("Komputer12", 24005, Status.NEW);
        orders[6] = new Order("Komputer333", 233005, Status.NEW);
        return orders;
    }

    private static void printOrders(Order[] orders, Status status) {
        System.out.printf("Lista zamówień ze statusem - %s\n", Status.valueOf(status.name()));
        Order[] results = filterOrdersByStatus(orders, status);
        for (Order result : results) {
            System.out.println(result);
        }
    }

    private static Status getStatus() {
        return Status.valueOf(scanner.nextLine());
    }

    private static int statusCounter(Order[] orders, Status status) {
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == status) {
                counter++;
            }
        }
        return counter;
    }

    private static Order[] filterOrdersByStatus(Order[] orders, Status status) {
        int arraySize = statusCounter(orders, status);
        Order[] results = new Order[arraySize];
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == status) {
                results[counter] = order;
                counter++;
            }
        }
        return results;
    }


    private static void allStatuses() {
        System.out.println("Podaj status zamówienia do wyświetlenia: ");
        for (Status value : Status.values()) {
            System.out.print(value.name() + " ");
        }
        System.out.println();
    }
}
