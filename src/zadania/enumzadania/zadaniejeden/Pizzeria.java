package zadania.enumzadania.zadaniejeden;

import java.util.Scanner;

class Pizzeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizzas available:");
        for (Pizza value : Pizza.values()) {
            System.out.println(value + " - składniki:" );
                System.out.println("    " + value.getIngredient1());
                System.out.println("    " + value.getIngredient2());
                System.out.println("    " + value.getIngredient3());
        }


        System.out.println("Which pizza do you choose?");
        String choice = scanner.nextLine();

        Pizza pizza = Pizza.valueOf(choice);

        System.out.println("Order summary:");
        if (choice.equals("MARGHERITA")){
            System.out.printf("You have chosen pizzas: %s, with ingredients: %s, %s",
                    choice, pizza.getIngredient1(), pizza.getIngredient2());
        }else
            System.out.printf("You have chosen pizzas: %s, with ingredients: %s, %s, %s",
                choice, pizza.getIngredient1(), pizza.getIngredient2(), pizza.getIngredient3());

    }
}
