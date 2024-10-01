package vehicles;

public class Car extends Vehicle{
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber){
        setModel(model);
        setColor(color);
        setLicense(license);
        setYear(year);
        setOwnerName(ownerName);
        setInsuranceNumber(insuranceNumber);
        this.engineType = "Combustion";
    }
    //
    public String toString(){
        return "Model: " + getModel() + "; license: " + getLicense() + "; Color: " + getColor() + "; year: "+getYear()+"; ownerName: "+getOwnerName()+"; insuranceNumber: "+getInsuranceNumber()+"; engineType: "+getEngineType();
    }
    @Override
    public String vehicleType(){
        return "Car";
    }
    
}