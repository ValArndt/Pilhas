public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    //. contrutor que recebe o tamanho do array
    public StaticStack(int size) {
        data = (T[]) new Object[size];
    }

    //. metodo que adiciona um item ao topo da pilha conforme explicado 
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError("Cheio");
        }
        data[++top] = item;
    }

    //. metodo que remove o item do topo da pilla remove o ultimo adicionado
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Vazio");
        }
        return data[top--];
    }

    //. metodo que limpa a pilha (reseta o topo) definindo a pilha como -1
    public void clear() {
        top = -1;
    }

    //. metodo que verifica se a pilha esta cheia e retorna um verdadeiro ou falso
    public boolean isFull() {
        return top == data.length - 1;
    }

    //. metodo que verifica se a pilha esta vazia e retorna um verdadeiro ou falso 
    public boolean isEmpty() {
        return top == -1;
    }
}
