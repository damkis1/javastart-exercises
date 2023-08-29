package zadania.metodyklasyobject.zadaniejeden;

class NotebookShop {
    public static void main(String[] args) {
        Computer computer = new Computer("Daaa",1);
        Computer computer2 = new Computer("beeee",21);
        Computer computer1 = new Computer("aDaaa",221);
        Computer computer3 = new Computer("Daaa",1);
        Computer computer4 = new Computer("aDaaa",1242);

        DataStore dataStore = new DataStore();

        dataStore.add(computer);
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);

        for (Computer dataStoreComputer : dataStore.getComputers()) {
            System.out.println(dataStoreComputer);
        }

        Computer computerToFind = new Computer("Daaa",1);
        System.out.printf("Number of selected models: %d",dataStore.checkAvailability(computerToFind));
    }
}
