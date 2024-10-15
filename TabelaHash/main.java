public static void main(String[] args) {
    TabelaHash tabela = new TabelaHash();

    // Inserindo os valores fornecidos
    int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};
    System.out.println("Inserindo valores...");
    for (int valor : valores) {
        tabela.inserir(valor);
    }

    // Imprime a tabela após as inserções
    System.out.println("\nTabela após inserções:");
    tabela.imprimir();

    // Testando busca
    System.out.println("\nBuscando valores:");
    System.out.println("Buscar 53: " + tabela.buscar(53)); // true (presente)
    System.out.println("Buscar 99: " + tabela.buscar(99)); // false (ausente)

    // Testando remoção
    System.out.println("\nRemovendo valor 53:");
    System.out.println("Remover 53: " + tabela.remover(53)); // true (removido)
    
    // Imprime a tabela após a remoção
    System.out.println("\nTabela após remover 53:");
    tabela.imprimir();

    // Tentando remover novamente
    System.out.println("\nTentando remover 53 novamente:");
    System.out.println("Remover 53: " + tabela.remover(53)); // false (já removido)
}
