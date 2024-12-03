public class Circle {
    private final String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setProperties(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle: [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
