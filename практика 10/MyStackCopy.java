import java.util.ArrayList;

public class MyStackCopy {
    private ArrayList<Object> list = new ArrayList<>();

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Получение размера стека
    public int getSize() {
        return list.size();
    }

    // Получение верхнего элемента без удаления
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    // Удаление и возвращение верхнего элемента
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    // Добавление элемента в стек
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    // Глубокая копия стека
    @Override
    public MyStack clone() {
        MyStack clonedStack = new MyStack();
        for (Object item : this.list) {
            clonedStack.push(item);
        }
        return clonedStack;
    }
}
