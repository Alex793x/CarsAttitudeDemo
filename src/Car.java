public class Car {
    private String brand;
    private String model;
    private String honk;
    private boolean engineStatus;
    private Driver driver;


    // Getters -----------------
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getHonk() {
        return honk;
    }

    public boolean getEngineStatus() {
        return engineStatus;
    }

    public Driver getDriver() {
        return driver;
    }


    //Setters -------------------
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setModel(String newModel) {
        this.model = newModel;
    }

    void setHonk(String newHonk) {
        this.honk = newHonk;
    }

    void setEngineStatus(boolean newEngineStatus) {
        this.engineStatus = newEngineStatus;
    }

    void setDriver(Driver newDriver) {
        this.driver = newDriver;
    }

    // Car Constructors -----------

    // Default car constructor
    public Car() {
        brand = "Tesla";
        model = "Model X";
        honk = "Diiscoooo";
        driver = null;
    }

    // Constructor without driver
    public Car(String brand, String model, String honk) {
        setBrand(brand);
        setModel(model);
        setHonk(honk);
    }

    //Constructor with a driver
    public Car(String brand, String model, String honk, Driver driver) {
        setBrand(brand);
        setModel(model);
        setHonk(honk);
        setDriver(driver);
    }

    public void sound() {
        System.out.println(this.getHonk());
    }

    public void drive() {
        if (this.getEngineStatus() && this.driver != null && this.driver.getDriversLicense())
            System.out.println(this.getBrand() + " " + this.getModel() + " is driving" +
                    " with your driver " + this.driver.getName());
        else
            System.out.println("You can't drive since either you need to turn on the car, or get a driver with a driver's license");

    }

    public void park() {
        if (this.driver != null && this.driver.getDriversLicense())
            System.out.println(this.getBrand() + " " + this.getModel() + "  been parked");
        else
            System.out.println("You can't park, since either you need a driver or your driver doesn't have driver's license");
    }

    public void turnEngineOn() {
        if (this.driver != null && this.driver.getDriversLicense()) {
            setEngineStatus(true);
            System.out.println("The car has been turned on by your driver " + this.driver.getName());
        } else {
            System.out.println("Either you need a driver or your driver doesn't have driver's license");
        }

    }

    public void turnEngineOff() {
        if (this.driver != null && this.driver.getDriversLicense()) {
            setEngineStatus(true);
            System.out.println("The car has been turned off by your driver " + this.driver.getName());
        } else {
            System.out.println("Either you need a driver or your driver doesn't have driver's license");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", honk='" + honk + '\'' +
                ", engineStatus=" + engineStatus +
                ", driver=" + driver +
                '}';
    }
}
