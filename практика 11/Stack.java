import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Помещает элемент на вершину стека
    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        // Обмен очередей
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Удаляет элемент с вершины стека и возвращает его
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.poll();
    }

    // Возвращает элемент на вершине стека
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    // Проверяет, пуст ли стек
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Возвращает строковое представление стека
    @Override
    public String toString() {
        return queue1.toString();
    }
}
