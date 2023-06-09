package zadania.tablicejednowymiarowe.zadaniedwa;

import java.util.Arrays;

class Elevator {
    private final Person [] peopleElevator = new Person[4];
    int peopleNumber = 0;
    private final int maxWeight = 400;



    public void add(Person person){
        if (peopleNumber < peopleElevator.length){
            peopleElevator[peopleNumber] = person;
            peopleNumber++;
        }else System.out.println("Winda jest pełna, już nie wsiądziesz");
    }
    
    public void start(){
        if (getTotalWeight() > maxWeight){
            System.out.printf("Winda jest przeciążona o %d km\n", getTotalWeight() - maxWeight);
        }else System.out.println("Winda rusza");
    }

    int getTotalWeight() {
        int sumWeight = 0;
        for (Person person : peopleElevator) {
            if (person == null)
                break;
            sumWeight += person.getWeight();
        }
        return sumWeight;
    }

    public void clear(){
        Arrays.fill(peopleElevator, null);
        peopleNumber = 0;
        System.out.println("Winda jest pusta");
    }

    public void showPeople(){
        for (Person person : peopleElevator) {
            System.out.println(person);
        }
    }

}
