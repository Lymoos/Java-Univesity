package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;
public class TestCar {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota", "A123BC", "Red", 2015, "Максим Ш", "20840XD", "Diesel");
        car1.setInsuranceNumber("1039XD");
        car1.setColor("Blue");
        System.out.println("Машина 1: [" + car1 + "]");

        Vehicle car2 = new ElectricCar("Tesla", "B456CD", "Green", 2020, "Дмитрий Н", "94C0003", 75);
        car2.setLicense("Ab0ba");
        car2.setOwnerName("Денис Г.");
        System.out.println("Машина 2: [" + car2 + "]");
    }
}
