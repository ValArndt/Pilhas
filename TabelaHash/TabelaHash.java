public class TabelaHash {
    private static final int TAMANHO = 10; 
    private int[] tabela; 

    public TabelaHash() {
        tabela = new int[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            tabela[i] = 0;
        }
    }

    private int funcaoHash(int chave) {
        return chave % TAMANHO;
    }

    public boolean inserir(int chave) {
        int hash = funcaoHash(chave);
        for (int i = 0; i < TAMANHO; i++) {
            int posicao = (hash + i) % TAMANHO;
            if (tabela[posicao] == 0) {
                tabela[posicao] = chave;
                return true;
            }
        }
        System.out.println("Erro: Tabela cheia!");
        return false;
    }

    public boolean buscar(int chave) {
        int hash = funcaoHash(chave);
        for (int i = 0; i < TAMANHO; i++) {
            int posicao = (hash + i) % TAMANHO;
            if (tabela[posicao] == 0) {
                return false; 
            }
            if (tabela[posicao] == chave) {
                return true; 
            }
        }
        return false; 
    }

    public boolean remover(int chave) {
        int hash = funcaoHash(chave);
        for (int i = 0; i < TAMANHO; i++) {
            int posicao = (hash + i) % TAMANHO;
            if (tabela[posicao] == 0) {
                return false; 
            }
            if (tabela[posicao] == chave) {
                tabela[posicao] = 0; 
                return true;
            }
        }
        return false; 
    }

    public void imprimir() {
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Posição " + i + ": " + tabela[i]);
        }
    }
}
