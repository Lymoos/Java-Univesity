import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
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

        // Создаем сканнер для ввода данных от пользователя
        Scanner input = new Scanner(System.in);
        try{
        // Запрашиваем стороны треугольника
        System.out.print("Введите сторону 1 треугольника: ");
        double side1 = input.nextDouble();
        System.out.print("Введите сторону 2 треугольника: ");
        double side2 = input.nextDouble();
        System.out.print("Введите сторону 3 треугольника: ");
        double side3 = input.nextDouble();

        // Запрашиваем цвет треугольника
        System.out.print("Введите цвет треугольника: ");
        String color = input.next();

        // Запрашиваем, закрашен ли треугольник
        System.out.print("Треугольник закрашен? (true/false): ");
        boolean filled = input.nextBoolean();

        // Создаем объект треугольника с введенными параметрами
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Выводим информацию о треугольнике
        System.out.println("\n" + triangle.toString());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Закрашен: " + triangle.isFilled());
        } catch(IllegalTriangleException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}
    
