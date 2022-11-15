package Question1;

public class CollegeStudent extends Student {
    protected String major;
    protected double year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String m, double y) {
        super(name, age, gender, idNum, gpa);
        major = m;
        year = y;
    }

    public String toString(){
        return super.toString() + ", Major: " + getMajor() + ", Year: " + getYear();
    }
    public String getMajor() {
        return major;
    }
    public double getYear() {
        return year;
    }
    public String setMajor(String m) {
        return major = m;
    }
    public double setYear(double y) {
        return year = y;
    }
}
