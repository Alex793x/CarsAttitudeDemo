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
        if (this.getEngineStatus())
            System.out.println(this.getBrand() + " " + this.getModel() + " is driving");
        else
            System.out.println("Error, you need to turn on the car");

    }

    public void park() {
        System.out.println(this.getBrand() + " " + this.getModel() + "  been parked");
    }

    public void turnEngineOn() {
        setEngineStatus(true);
    }

    public void turnEngineOff() {
        setEngineStatus(false);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", honk='" + honk + '\'' +
                ", engineStatus=" + engineStatus +
                '}';
    }
}
