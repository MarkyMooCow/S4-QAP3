package Question1;

class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) { // use the super class’ constructor
// initialize what’s new to Student
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    public String getMyIdNum() {
        return myIdNum;
    }
    public double getMyGPA() {
        return myGPA;
    }
    public String setMyIdNum(String x) {
        return myIdNum = x;
    }
    public double setMyGPA(double x) {
        return myGPA = x;
    }
}
