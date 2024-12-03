public class Test {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Текущее состояние: Create");
        order.processOrder();

        System.out.println("\nПереход к следующему состоянию: Processing");
        order.setState(new ProcessingState());
        order.processOrder();

        System.out.println("\nПереход к следующему состоянию: Shipped");
        order.setState(new ShippedState());
        order.processOrder();
    }
}
