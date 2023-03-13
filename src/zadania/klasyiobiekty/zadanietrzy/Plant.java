package zadania.klasyiobiekty.zadanietrzy;

public class Plant {
    private String name;
    private String description;
    private double waterADay;

    public Plant(String name, String description, double waterADay) {
        this.name = name;
        this.description = description;
        this.waterADay = waterADay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWaterADay() {
        return waterADay;
    }

    public void setWaterADay(double waterADay) {
        this.waterADay = waterADay;
    }

}
