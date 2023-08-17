package zadania.skladowestatyczne.zadaniejeden;

class Student {
    public static int studentsNumber = 0;
    private String name;
    private String lastName;
    private String index;

    public Student(String name, String lastName, String index) {
        studentsNumber++;
        this.name = name;
        this.lastName = lastName;
        this.index = index;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }

    public static void setStudentsNumber(int studentsNumber) {
        Student.studentsNumber = studentsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
