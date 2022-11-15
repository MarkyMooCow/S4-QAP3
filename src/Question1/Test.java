package Question1;

public class Test {
    public static void main(String[] args) {
        Person noah = new Person("Noah Keves", 18, "M");
        System.out.println(noah);

        Student mio = new Student("Mio Agnus", 19, "F", "HS95129", 3.5);
        System.out.println(mio);

        Teacher msHogg = new Teacher("Lianne Hogg", 34, "F", "English", 50000);
        System.out.println(msHogg);

        CollegeStudent haru = new CollegeStudent("Haru Okumura", 18, "F", "UCB123", 4.0, "Herbology", 1);
        System.out.println(haru);
    }
}
