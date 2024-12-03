public class FlyweightPatternExample {
    public static void main(String[] args) {
        CircleFactory factory = new CircleFactory();

        Circle redCircle1 = factory.getCircle("Red");
        redCircle1.setProperties(10, 20, 5);
        redCircle1.draw();

        Circle redCircle2 = factory.getCircle("Red");
        redCircle2.setProperties(15, 25, 10);
        redCircle2.draw();

        Circle blueCircle = factory.getCircle("Blue");
        blueCircle.setProperties(30, 40, 15);
        blueCircle.draw();
    }
}
