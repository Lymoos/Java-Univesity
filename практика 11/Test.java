public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Элемент на верхушке: " + stack.top());
        stack.pop();
        System.out.println("Пустой? " + stack.empty());
        System.out.println("Элементы: " + stack.toString());
    }
}
