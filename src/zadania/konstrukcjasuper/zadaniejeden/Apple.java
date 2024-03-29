package zadania.konstrukcjasuper.zadaniejeden;

class Apple extends Fruit{
    public static final String TYPE = "jabłkowate";
    private String variety;
    public Apple(int weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", odmiana: %s", variety);
    }
}
