package aula4;

public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5); // Fila de tamanho 5

        // Adicionando elementos na fila
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Tentativa de adicionar a mais na fila cheia
        try {
            queue.add(6);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Removendo dois elementos
        System.out.println("Removido: " + queue.remove()); // Deve imprimir 1
        System.out.println("Removido: " + queue.remove()); // Deve imprimir 2

        // Adicionando mais elementos
        queue.add(6);
        queue.add(7);

        // Removendo todos os elementos restantes
        while (!queue.isEmpty()) {
            System.out.println("Removido: " + queue.remove());
        }

        // Tentativa de remover da fila vazia
        try {
            queue.remove();
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Limpando a fila e verificando se está vazia
        queue.clear();
        if (queue.isEmpty()) {
            System.out.println("A fila foi limpa e está vazia.");
        }
        queue.print();
    }
}
