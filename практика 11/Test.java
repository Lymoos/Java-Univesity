public class Test {
    public static void main(String[] args) {
        // Создание стека
        Stack stack = new Stack();

        // Добавление элементов
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Элемент на верхушке: " + stack.top());

        stack.pop();

        System.out.println("Пустой? " + stack.empty());

        System.out.println("Элементы: " + stack.toString());
    }
}
