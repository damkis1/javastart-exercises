package zadania.polimorfizmrzutowanietypow.zadaniejeden;

public class Nurse extends Person{
    private int overtime;

    public Nurse(String firstName, String lastName, double salary, int overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    String getInfo() {
        return super.getInfo() + String.format(", nadgodziny: %d", overtime);
    }
}
