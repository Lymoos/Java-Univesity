public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /** Конструктор по умолчанию, создает треугольник с заданными значениями сторон */
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    /** Конструктор с параметрами, который создает треугольник с указанными сторонами */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Сумма длин любых двух сторон должна быть больше длины третьей стороны.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Возвращает сторону 1 */
    public double getSide1() {
        return side1;
    }

    /** Возвращает сторону 2 */
    public double getSide2() {
        return side2;
    }

    /** Возвращает сторону 3 */
    public double getSide3() {
        return side3;
    }

    /** Возвращает площадь треугольника */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Возвращает периметр треугольника */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Возвращает строковое описание треугольника */
    @Override
    public String toString() {
        return "Треугольник: сторона 1 = " + side1 + " сторона 2 = " + side2 + " сторона 3 = " + side3;
    }
}