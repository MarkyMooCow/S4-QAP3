package Question1;


public class Teacher extends Person {
    protected String subject; // Student Id Number
    protected double salary; // grade point average

    public Teacher(String name, int age, String gender, String sub, double sal) {
        super(name, age, gender);
        subject = sub;
        salary = sal;
    }
    public String getSubject() {
        return subject;
    }
    public double getSalary() {
        return salary;
    }
    public String setSubject(String sub) {
        return subject = sub;
    }
    public double setSalary(double sal) {
        return salary = sal;
    }
    public String toString() {
        return super.toString() + ", Salary: " + getSalary() + ", Subject: " + getSubject();
    }
}
