import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) throws IllegalTriangleException {
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

        Circle circle1 = new Circle(5, "red", true);
        Circle circle2 = new Circle(3, "blue", false);
        GeometricObject largerCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг имеет площадь: " + largerCircle.getArea());

        // Проверка max() для прямоугольников
        Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
        Rectangle rectangle2 = new Rectangle(2, 3, "yellow", false);
        GeometricObject largerRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник имеет площадь: " + largerRectangle.getArea());

        int comparisonResult = circle1.compareTo(rectangle1);
        if (comparisonResult > 0) {
            System.out.println("Круг имеет большую площадь, чем прямоугольник.");
        } else if (comparisonResult < 0) {
            System.out.println("Прямоугольник имеет большую площадь, чем круг.");
        } else {
            System.out.println("Круг и прямоугольник имеют одинаковую площадь.");
        }


         // Создаем массив из 5 объектов типа GeometricObject
         GeometricObject[] objects = new GeometricObject[5];

         // Заполняем массив различными объектами
         objects[0] = new Circle(2.5, "red", true);
         objects[1] = new Square(3.0);
         objects[2] = new Rectangle(4.0, 5.0, "green", true);
         objects[3] = new Square(5.0);
         objects[4] = new Triangle(3.0, 4.0, 5.0);
         objects[4].setColor("blue");
         objects[4].setFilled(false);
         // Проходим по массиву и выводим информацию
         for (int i = 0, i<5, i++) {
            System.out.println(objects[i].toString());
             System.out.println("Площадь: " + objects[i].getArea());
 
             // Если объект реализует интерфейс Colorable, вызываем метод howToColor
             if (objects[i] instanceof Colorable) {
                
                 ((Colorable) objects[i]).howToColor();
             }
         }
    }
}
    
