public class PizzaOrder extends Order{
    @Override
    public String getDescription() {
        return "Pizza order. Time: " + java.time.LocalDateTime.now();
    }
}
