import java.util.Scanner;

public class TestCircleRectangle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите первую сторону треугольника: ");
            double side1 = input.nextDouble();
            System.out.print("Введите вторую сторону треугольника: ");
            double side2 = input.nextDouble();
            System.out.print("Введите третью сторону треугольника: ");
            double side3 = input.nextDouble();
            System.out.print("Введите цвет треугольника: ");
            String color = input.next();
            System.out.print("Заполнен ли треугольник? (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println("\n" + triangle.toString());
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Заполнен: " + triangle.isFilled());

            Circle circle1 = new Circle(3);
            circle1.setColor("red");
            Circle circle2 = new Circle(4);
            circle2.setColor("blue");
            System.out.println("\nБольший из двух кругов: " + GeometricObject.max(circle1, circle2).toString());

            Rectangle rectangle1 = new Rectangle(5, 14);
            rectangle1.setColor("red");
            Rectangle rectangle2 = new Rectangle(4, 15);
            rectangle2.setColor("blue");
            System.out.println("Больший из двух прямоугольников: " + GeometricObject.max(rectangle1, rectangle2).toString());

            ComparableCircle compCircle1 = new ComparableCircle(6);
            ComparableCircle compCircle2 = new ComparableCircle(7);
            System.out.println("Сравнение двух кругов:");
            if (circle1.compareTo(compCircle1) > 0) {
                System.out.println("circle1 больше circle2");
            } else if (circle1.compareTo(compCircle2) < 0) {
                System.out.println("circle2 больше circle1");
            } else {
                System.out.println("Оба круга равны по площади");
            }

            // Сравниваем круг и прямоугольник, используя метод max для GeometricObject
            System.out.println("\nСравнение круга и прямоугольника:");
            if (circle1.compareTo(rectangle1) > 0) {
                System.out.println("Круг больше прямоугольника");
            } else {
                System.out.println("Прямоугольник больше круга");
            }
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}