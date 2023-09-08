package zadania.enumzadania.zadaniejeden;

enum Pizza {
    MARGHERITA("tomato sauce", "cheese",""),
    CAPRICIOSA("tomato sauce", "cheese", "champignons"),
    PROSCIUTTO("tomato sauce", "cheese", "ham");

    private final String ingredient1;
    private final String ingredient2;
    private final String ingredient3;



    Pizza(String ingredient1, String ingredient2, String ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }
}
