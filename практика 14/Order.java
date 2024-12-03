public class Order {
    private State state;

    public Order() {
        this.state = new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void processOrder() {
        state.handle();
    }
}