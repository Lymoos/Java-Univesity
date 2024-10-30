import java.util.ArrayList;

public class GenericStack1<E> extends ArrayList<E> {
    public GenericStack1() {
        super();
    }

    public void push(E value) {
        add(value);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return remove(size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return get(size() - 1);
    }
}
