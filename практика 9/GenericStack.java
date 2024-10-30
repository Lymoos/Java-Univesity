public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(E value) {
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size++] = value;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        E[] newElements = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: ");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]).append(" ");
        }
        return sb.toString();
    }
}
