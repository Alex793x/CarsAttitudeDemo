
public class Main {
    public static void main(String[] args) {

        /* This initial code is just a test for setters

        Car manualInputCar = new Car();                    creating car with empty constructor

        manualInputCar.setBrand("Nissan");                  Testing Setters -----
        manualInputCar.setModel("Olympic");                 ---------||---------
        manualInputCar.setHonk("Kabooom");                  ---------||---------
        System.out.println(manualInputCar.getBrand());      Testing Getters
        System.out.println(manualInputCar.getModel());      ---------||---------
        System.out.println(manualInputCar.getHonk());       ---------||---------
         */

        Driver driverOne = new Driver("Mason");
        Driver driverTwo = new Driver('F', "Johanna", 42, true);
        Driver driverThree = new Driver('M', "Kim", 17, true);
        Driver driverFour = new Driver('F', "Jasmin", 19, true);

        System.out.println(driverOne);
        System.out.println();
        System.out.println(driverTwo);
        System.out.println();
        System.out.println(driverThree);
        System.out.println();
        System.out.println(driverFour);
        System.out.println();

        Car standardCar = new Car();
        Car myCar = new Car("Mercedes", "Sprinter", "Weeeeehuuuu");
        System.out.println("Car without a driver\n");
        myCar.drive();
        myCar.park();
        myCar.turnEngineOn();

        System.out.println("----------------------------------------------------------\n");


        System.out.println("Car with a driver\n");
        // Associating driverFour with a car
        Car carWithDriverOne = new Car("Opel", "Astra", "Oiiink", driverFour);
        carWithDriverOne.drive();
        carWithDriverOne.turnEngineOn();
        carWithDriverOne.park();
        carWithDriverOne.turnEngineOff();

        System.out.println("----------------------------------------------------------\n");


        System.out.println("Car with an underage driver\n");

        Car carWithUnderAgedDriver = new Car("Nissan", "Qashqai", "Baaduuuu", driverThree);
        carWithUnderAgedDriver.drive();
        carWithUnderAgedDriver.turnEngineOn();
        carWithUnderAgedDriver.park();
        carWithUnderAgedDriver.turnEngineOff();
    }
}