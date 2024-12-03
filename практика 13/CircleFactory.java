import java.util.HashMap;

public class CircleFactory {
    private final HashMap<String, Circle> circleMap = new HashMap<>();

    public Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating with color: " + color);
        }

        return circle;
    }
}
    