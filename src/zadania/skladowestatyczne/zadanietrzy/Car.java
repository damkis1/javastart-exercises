package zadania.skladowestatyczne.zadanietrzy;

class Car {
    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARNING_DOORS_OPEN = 500;

    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOk, boolean engineOn, boolean fuelFlapOpen, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0)
            engineOn = false;
        this.fuel = fuel;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        if (!engineOk)
            engineOn = false;
        this.engineOk = engineOk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL)
            this.engineOn = false;
        else
            this.engineOn = engineOn;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    int start(){
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }
    int systemCheck(){
        if (!engineOk)
            return ERROR_CHECK_ENGINE;
        if (fuel == 0)
           return ERROR_NO_FUEL;
        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsOpen)
            return WARNING_DOORS_OPEN;
        else return OK;
    }
    String status(){
        int systemCheck = systemCheck();
        if (systemCheck == OK)
            return "Wszystko git, można jechać";
        String status = "Hooston mamy problem\n";
        if (systemCheck == ERROR_CHECK_ENGINE)
            status += "> silnik uszkodzony\n";
        if (systemCheck == ERROR_NO_FUEL)
            status += "> brak paliwa\n";
        if (systemCheck == WARNING_FUEL_FLAP_OPEN)
            status += "> klapa od wlewu paliwa otwarta\n";
        if (systemCheck == WARNING_DOORS_OPEN)
            status += ">drzwi otwarte\n";
        if (engineOn)
            status += ">Silnik włączony";

        else status += ">Silnik wyłączony";
        return status;
    }
}
