package Question1;

class Person {

    protected String myName, myGender; // name, age and gender of the person | “M” for male, “F” for female
    protected int myAge;
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    // To String
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }

    // Get/Set Methods
    public String getName() {
        return myName;
    }
    public int getAge() {
        return myAge;
    }
    public String getGender() {
        return myGender;
    }
    public String setName(String x) {
        return myName = x;
    }
    public int setAge(int x) {
        return myAge = x;
    }
    public String setGender(String x) {
        return myGender = x;
    }
}