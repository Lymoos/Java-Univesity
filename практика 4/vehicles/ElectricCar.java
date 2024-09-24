package vehicles;
public class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber,"Electric");
        this.batteryCapacity = batteryCapacity;;
    }
    public int BCGet() {
        return batteryCapacity;
    }

    public void BCSet(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String toString() {
        return super.toString() + "; Battery Capacity: " + batteryCapacity;
    }
    @Override
    public String vehicleType(){
        return "Electric Car";
    }
}