package aula4; //. lembrar de colocar o package aula4 no inicio do arquivo.
public class CircularQueue<T> {
    private int top = -1;  // Inicializa o topo com -1, indicando que a fila está vazia
    private int base = 0;  // Base da fila
    private int size = 0;  // Contador de elementos na fila
    private T[] data;      // Array que armazena os elementos da fila

    public CircularQueue(int tamanho) {
        data = (T[]) new Object[tamanho];
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia");
        }
        top = move(top);   // Move para o próximo índice
        data[top] = item;  // Adiciona o item na posição `top`
        size++;            // Incrementa o tamanho da fila
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        T item = data[base];  // Remove o item da posição `base`
        data[base] = null;    // Limpa a posição `base`
        base = move(base);    // Move para o próximo índice
        size--;               // Decrementa o tamanho da fila
        return item;
    }

    public void clear() {
        top = -1;  // Reseta o topo
        base = 0;  // Reseta a base
        size = 0;  // Reseta o tamanho
        data = (T[]) new Object[data.length];  // Cria um novo array para os dados
    }

    public boolean isEmpty() {
        return size == 0;  // A fila está vazia se o tamanho for 0
    }

    public boolean isFull() {
        return size == data.length;  // A fila está cheia se o tamanho for igual ao comprimento do array
    }

    private int move(int position) {
        return (position + 1) % data.length;  // Move para o próximo índice circular
    }
}
