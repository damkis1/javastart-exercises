package zadania.dziedziczenie.zadaniedwa;

class Bootcamp extends OnlineCourse{
    String teachersName;
    String teachersSurname;
    private int ConsultationsHours;


    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getTeachersSurname() {
        return teachersSurname;
    }

    public void setTeachersSurname(String teachersSurname) {
        this.teachersSurname = teachersSurname;
    }

    public int getConsultationsHours() {
        return ConsultationsHours;
    }

    public void setConsultationsHours(int consultationsHours) {
        ConsultationsHours = consultationsHours;
    }

    @Override
    public String toString() {
        return super.toString() + "Bootcamp{" +
                "teachersName='" + teachersName + '\'' +
                ", teachersSurname='" + teachersSurname + '\'' +
                ", ConsultationsHours=" + ConsultationsHours +
                '}';
    }
}
