package vehicles;

public class Car{
    private String ownerName;
    private String insuranceNumber;

    protected String engineType;

    public void ONSet(String name){
        this.ownerName = name;
    }
    public void INSet(String number){
        this.insuranceNumber = number;
    }
    public void ETSet(String type){
        this.engineType = type;
    }
    public String ONGet(){
        return ownerName;
    }
    public String INGet(){
        return insuranceNumber;
    }
    public String ETGet(){
        return engineType;
    }

}