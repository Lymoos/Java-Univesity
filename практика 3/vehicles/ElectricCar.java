package vehicles;
public class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar(int batteryCapacity) {
        this.engineType = "Electric";
    }
    public int BCGet() {
        return batteryCapacity;
    }

    public void BCSet(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}