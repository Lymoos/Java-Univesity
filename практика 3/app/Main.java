package app;
import vehicles.Car;
import vehicles.ElectricCar;


public class Main {
    public static void main(String[] args) {
        System.out.println("Машина 1");
        Car car1 = new Car();
        car1.ONSet("Максим Ш");
        car1.INSet("20840XD");
        car1.ETSet("дизельный");

        System.out.println("Владелец: " + car1.ONGet());
        System.out.println("Номер страховки: " + car1.INGet());
        System.out.println("Тип двигателя: " + car1.ETGet());

        System.out.println("Машина 2");
        ElectricCar car2 = new ElectricCar(200);
        car2.ONSet("Дмитрий Н");
        car2.INSet("94С0003");

        System.out.println("Владелец: " + car2.ONGet());
        System.out.println("Номер страховки: " + car2.INGet());
        System.out.println("Тип двигателя: " + car2.ETGet());
        System.out.println("Мощность батарейки: " + car2.BCGet());
    }
}
