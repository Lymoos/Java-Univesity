public class ShippedState implements State {
    @Override
    public void handle() {
        System.out.println("The order has already been shipped. If you don't have it, it's not our problem.");
    }
}