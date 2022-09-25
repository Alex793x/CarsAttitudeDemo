public class Car {
    private String brand;
    private String model;
    private String honk;
    private boolean engineStatus;


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

    // Car Constructor -----------
    public Car() {
    }

    public Car(String brand, String model, String honk) {
        this.brand = brand;
        this.model = model;
        this.honk = honk;
    }

    public void sound() {
        System.out.println(this.getHonk());
    }

    public void drive() {
        if (this.getEngineStatus() == true)
            System.out.println(this.getBrand() + " " + this.getModel() + " is driving");
        else
            System.out.println("Error, you need to turn on the car");

    }

    public void park() {
        System.out.println(this.getBrand() + " " + this.getModel() + "  been parked");
    }

    public void turnEngineOn() {
        this.engineStatus = true;
    }

    public void turnEngineOff() {
        this.engineStatus = false;
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
