import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число от 1 до 12: ");
            int month = scanner.nextInt();
            System.out.println("Месяц: " + months[month - 1]);
            System.out.println("Количество дней: " + dom[month - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число. Введите число от 1 до 12.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите целое число.");
        } finally {
            scanner.close();
        }
    }
}
