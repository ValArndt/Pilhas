package pilha;
public class DynamicStack<T> {
    private Node<T> top; // Referência para o nó no topo da pilha

    // Classe interna estática Node que representa um elemento na pilha
    private static class Node<T> {
        T data;        // Dado armazenado no nó
        Node<T> next;  // Referência para o próximo nó na pilha

        // Construtor do nó
        Node(T data) {
            this.data = data;
        }
    }

    // Método para adicionar um item ao topo da pilha
    public void push(T item) {
        Node<T> newNode = new Node<>(item); // Cria um novo nó com o item
        newNode.next = top;  // Faz o novo nó apontar para o nó atual do topo
        top = newNode;       // Atualiza o topo para ser o novo nó
    }

    // Método para remover e retornar o item do topo da pilha
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        T data = top.data; // Armazena o dado do nó do topo
        top = top.next;    // Atualiza o topo para o próximo nó
        return data;       // Retorna o dado removido
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == null; // A pilha está vazia se o topo for null
    }

    // Método para esvaziar a pilha
    public void clear() {
        top = null; // Reseta o topo para null, esvaziando a pilha
    }
}

//. pedir uma explicacao a proff melhor sobre essa pilha dinamica