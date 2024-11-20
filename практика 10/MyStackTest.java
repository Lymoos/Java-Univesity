import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack1 stack = new MyStack1();

        System.out.println("Введите пять строк для добавления в стек:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("\nВывод строк в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
