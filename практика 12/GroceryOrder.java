public class GroceryOrder extends Order{
    @Override
    public String getDescription() {
        return "Grocery order. Time:" + java.time.LocalDateTime.now();
    }
}
