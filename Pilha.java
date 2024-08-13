public class Pilha{
   private int topo = -1;
   private int[] data;

    public Pilha(int size) {
         data = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
            throw new StackOverflowError("Cheio");
        }
        data[++topo] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Vazio");
        }
        return data[topo--];
    }

    public void clear() {
        topo = -1;
    }

    public boolean isFull() {
        return topo == data.length - 1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

}