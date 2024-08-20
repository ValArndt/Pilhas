public class Fila {
    private Integer[] elementos;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        elementos = new Integer[capacidade]; //. array de inteiros que armazena os elementos da fila 
        inicio = 0; //. primeiro elemento da fila 
        fim = -1; //. ultimo elemento da fila 
        tamanho = 0; //. tamanho da fila 
    }

    public void enqueue(Integer elemento) {
        if (isFull()) { //.verifica se a fila esta cheia 
            throw new IllegalStateException("A fila está cheia");
        }

        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }

        int elementoRemovido = elementos[inicio];
        elementos[inicio] = 0; // Valor padrão para inteiros
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return elementoRemovido;
    }

    public Integer front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }

        return elementos[inicio];
    }
    //. front volta ao primeiro elemento da fila 

    public boolean isEmpty() {
        return tamanho == 0;
    }
    //. isempty verifica se a fila esta vazia comparando o tamanho com 0

    public boolean isFull() {
        return tamanho == capacidade;
    //. isfull verifica se a fila esta cheia comparando o tamanho com a capacidade 
    }
}