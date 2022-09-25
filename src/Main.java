
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


        Car myCar = new Car("Mercedes", "Sprinter", "Weeeeehuuuu");
        System.out.println(myCar);
    }
}