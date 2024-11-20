public class Test {
    public static void main(String[] args) {
        DeliveryService pizzaService = new PizzaDelivery();
        DeliveryService groceryService = new GroceryDelivery();

        pizzaService.deliver();
        groceryService.deliver();
    }
}
