package zadania.metodyklasyobject.zadaniejeden;

class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer [] computers = new Computer[MAX_COMPUTERS];
    int computersNumber = 0;

    public Computer[] getComputers() {
        Computer [] computersWithoutNulls = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            computersWithoutNulls[i] = computers [i];
        }
        return computersWithoutNulls;
    }

    public void add(Computer computer){
        if (computersNumber == MAX_COMPUTERS){
            System.out.println("There is no space in the stock");
        }else if (computersNumber < MAX_COMPUTERS && computer != null){
            computers[computersNumber] = computer;
            computersNumber++;
        }
    }

    public int checkAvailability(Computer computer){
        int count = 0;
        if (computer == null)
            return 0;

        for (int i = 0; i < computersNumber; i++) {
            if (computer.equals(computers[i]))
                count++;
        }
        return count;
    }
}
