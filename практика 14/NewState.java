public class NewState implements State {
    @Override
    public void handle() {
        System.out.println("New order created");
    }
}