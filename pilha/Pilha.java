package pilha;
public class Pilha{
   private int topo = -1; //.indicando a possição do topo da pilha
   private int[] data;
   //. a clase pilha armazena um array de inteiro 

    public Pilha(int size) {
         data = new int[size];
    }
    //. aqui recebo o tamanho do array e inicio o array data com esse tamanho 

    public void push(int item) {
        if (isFull()) {
            throw new StackOverflowError("Esta Cheia");
        }
        data[++topo] = item;
    }
    //. push adiciono um item ao topo da linha 
    //. isfull verifico se a pilha esta cheia, caso esteja da um erro e entra a mensagem esta cheia 
    //. caso contrario entra no data e adiciona o item ao topo da pilha

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Esta Vazia");
        }
        return data[topo--];
    }
    //. pop remove o item do topo da pilha
    //. inempty verifica se a pilha esta vazia, caso esteja da um erro e entra a mensagem esta vazia
    //. caso contrario retorna o item do topo da pilha e decrementa o topo 

    public void clear() {
        topo = -1;
    }
    //. clear limpa a pilha, reseta o topo da pilha para -1 

    public boolean isFull() {
        return topo == data.length - 1;
    }
    //. isfull verifica se a pilha esta cheia comparando o topo com o valor maximo  data.length - 1

    public boolean isEmpty() {
        return topo == -1;
    }
    //. isempty verifica se a pilha esta vazia comparando o topo com -1
}