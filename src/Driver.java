public class Driver {
    private char gender = 'M';
    private String name;
    private int age = 18;
    private boolean driversLicense = true;


    //Getters ---------------------
    public char getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getDriversLicense() {
        return driversLicense;
    }

    // Setters ---------------------
    public void setGender(char newGender) {
        this.gender = newGender;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setDriversLicense(boolean hasDriversLicense) {
        this.driversLicense = hasDriversLicense;
    }



    //Driver Constructor
    public Driver(String newName) {
        setName(newName);
    }


    //Overloaded Driver constructor
    public Driver(char newGender, String newName, int newAge, boolean hasDriversLicense) {
        setGender(newGender);
        setName(newName);
        setAge(newAge);
        setDriversLicense(hasDriversLicense);
    }
}
