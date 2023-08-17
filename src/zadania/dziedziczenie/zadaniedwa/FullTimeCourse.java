package zadania.dziedziczenie.zadaniedwa;

class FullTimeCourse {
    private String city;
    private int numberOfClasses;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public String toString() {
        return super.toString() + "FullTimeCourse{" +
                "city='" + city + '\'' +
                ", numberOfClasses=" + numberOfClasses +
                '}';
    }
}
