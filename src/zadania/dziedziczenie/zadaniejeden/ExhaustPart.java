package zadania.dziedziczenie.zadaniejeden;

class ExhaustPart extends Part {
    private boolean europeanExhaustStandard;

    public boolean isEuropeanExhaustStandard() {
        return europeanExhaustStandard;
    }

    public void setEuropeanExhaustStandard(boolean europeanExhaustStandard) {
        this.europeanExhaustStandard = europeanExhaustStandard;
    }

    @Override
    public String toString() {
        return super.toString() + "ExhaustPart{" +
                "europeanExhaustStandard=" + europeanExhaustStandard +
                '}';
    }
}

