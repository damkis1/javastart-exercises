package zadania.skladowestatyczne.zadaniejeden;

class University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumber());
        Student student1 = new Student("Jan", "Kowalski", "9999999");
        Student student2 = new Student("Jan", "Kowalska", "66666666");
        Student student3 = new Student("Jan", "Kowalska", "66666666");
        Student student4 = new Student("Jan", "Kowalska", "66666666");
        Student student5 = new Student("Jan", "Kowalska", "66666666");
        Student student6 = new Student("Jan", "Kowalska", "66666666");
        Student student7 = new Student("Jan", "Kowalska", "66666666");
        Student student8 = new Student("Jan", "Kowalska", "66666666");
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsNumber());
    }
}
