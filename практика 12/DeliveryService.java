abstract class DeliveryService {
    public abstract Order createOrder();

    public void deliver() {
        Order order = createOrder();
        System.out.println("Delivering: " + order.getDescription());
    }
}
