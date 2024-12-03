public class ProcessingState implements State {
    @Override
    public void handle() {
        System.out.println("Order in processing. Just wait.");
    }
}