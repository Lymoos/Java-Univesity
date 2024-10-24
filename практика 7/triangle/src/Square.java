public class Square extends GeometricObject implements Colorable {
    private double side;

    // Конструктор без параметров
    public Square() {
        this.side = 0; // по умолчанию сторона 0
    }

    // Конструктор с параметрами
    public Square(double side) {
        this.side = side;
    }

    // Getter для стороны
    public double getSide() {
        return side;
    }

    // Setter для стороны
    public void setSide(double side) {
        this.side = side;
    }

    // Реализация метода для раскрашивания
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");
    }

    // Реализация методов для площади и периметра (наследуемые от GeometricObject)
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
