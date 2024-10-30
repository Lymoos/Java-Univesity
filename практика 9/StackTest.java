import com.sun.source.tree.CompilationUnitTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stackWithArray = new GenericStack<>();
        System.out.println("Введите пять строк для стека на основе массива:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stackWithArray.push(input);
        }
        System.out.println("Содержимое стека на основе массива в обратном порядке:");
        while (!stackWithArray.isEmpty()) {
            System.out.println(stackWithArray.pop());
        }

        GenericStack1<String> stackWithArrayList = new GenericStack1<>();
        System.out.println("\nВведите пять строк для стека на основе ArrayList:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stackWithArrayList.push(input);
        }
        System.out.println("Содержимое стека на основе ArrayList в обратном порядке:");
        while (!stackWithArrayList.isEmpty()) {
            System.out.println(stackWithArrayList.pop());
        }
        scanner.close();
    }
}
