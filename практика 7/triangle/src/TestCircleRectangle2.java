import java.util.Scanner;

public class TestCircleRectangle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(4);
        objects[1] = new Circle(3);
        objects[2] = new Rectangle(2, 5);
        objects[3] = new Square(7);
        objects[4] = new Circle(9);
        int i = 1;
        for (GeometricObject obj : objects) {
            System.out.println("Объект номер: " + i);
            System.out.println("Площадь объекта: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
            i++;
        }
    }
}