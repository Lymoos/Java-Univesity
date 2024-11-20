public class CopeTest {
    public static void main(String[] args) {
        MyStackCopy s = new MyStackCopy();
        s.push("Первый");
        s.push("Второй");
        s.push("Третий");

        MyStack clonedStack = s.clone();

        s.pop();

        System.out.println("Оригинальный стек: " + s);
        System.out.println("Клонированный стек: " + clonedStack);
    }
}
