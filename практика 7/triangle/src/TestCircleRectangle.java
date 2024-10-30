import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle(1);
        System.out.println("Круг " + circle.toString());
        System.out.println("Радиус равен " + circle.getRadius());
        System.out.println("Площадь равна " + circle.getArea());
        System.out.println("Диаметр равен " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nПрямоугольник " + rectangle.toString());
        System.out.println("Площадь равна " + rectangle.getArea());
        System.out.println("Периметр равен " +
                rectangle.getPerimeter());

    try{
        System.out.print("Введите первую сторону треугольника: ");
        double side1 = input.nextDouble();
        System.out.print("Введите вторую сторону треугольника: ");
        double side2 = input.nextDouble();
        System.out.print("Введите третью сторону треугольника: ");
        double side3 = input.nextDouble();
        System.out.print("Введите цвет треугольника: ");
        String color = input.next();
        System.out.print("Заполнен ли треугольник? (true / false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("\n" + triangle.toString());
        System.out.println("Площадь равна " + triangle.getArea());
        System.out.println("Периметр равен " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Заполнен: " + triangle.isFilled());
    }
    catch(IllegalTriangleException e){
        System.out.println(e.getMessage());
    }
    }
}