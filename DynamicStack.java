public class DynamicStack<T> {
    private Node<T> top;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cheia");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public void clear() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
