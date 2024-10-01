package app;

import vehicles.Car;
import vehicles.ElectricCar;
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "A123BC", "Red", 2015, "Максим Ш", "20840XD");
        car1.setYear(2016);
        car1.setOwnerName("Роберт Д.");
        car1.setInsuranceNumber("299ZV");
        System.out.println("Машина 1: [" + car1 + "]");

        ElectricCar car2 = new ElectricCar("Tesla", "B456CD", "Green", 2020, "Дмитрий Н", "94C0003", 75);
        car2.setYear(2024);
        car2.setOwnerName("Андрей Щ.");
        car2.setInsuranceNumber("39XAS2");
        System.out.println("Информация о емкости батареи у электромобиля: " + car2.getBatteryCapacity());
        System.out.println("Машина 2: [" + car2 + "]");
    }
}
