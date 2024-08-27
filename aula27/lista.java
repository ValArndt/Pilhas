public class lista{
    private int [] data;
    private int tamanho;
    private int tamanhoAtual;

    public lista(int tamanho){
        this.tamanho = tamanho;
        this.data = new int[tamanho];
        this.tamanhoAtual = 0;
    }
    public void clear(){
        this.tamanhoAtual = 0;
    }

    //. adicionar ao final da lista
    public void add(int valor) {
        if (isFull()) {
            System.out.println("Lista cheia.");
            return;
        }
        this.data[tamanhoAtual++] = valor;
    }
    //. adicionar a uma possicao especifica
    public void add(int valor, int posição){
        if (isFull()) {
            System.out.println("Lista cheia.");
            return;
        }
        if (posição < 0 || posição > tamanhoAtual) {
            System.out.println("Posição inválida.");
            return;
        }
        for (int i = tamanhoAtual; i > posição; i--) {
            data[i] = this.data[i - 1];
        }
        data[posição] = valor;
        tamanhoAtual++;
    }
    //. remover de uma possicao especifica
    public int remove(int posição){
        if (posição < 0 || posição >= tamanhoAtual) {
            System.out.println("Posição inválida.");
            return -1;
        }
        int removerValor = data[posição];
        for (int i = posição; i < tamanhoAtual - 1; i++) {
            data[i] = data[i + 1];
        }
        tamanhoAtual--;
        return removerValor;
    }
    public boolean isEmpty() {
        return tamanhoAtual == 0;
    }
    public boolean isFull() {
        return tamanhoAtual == tamanho;
    }
    //. definir o valor de uma posicao
    public void setData(int valor, int posição){
        if (posição < 0 || posição >= tamanhoAtual) {
            System.out.println("Posição inválida.");
            return;
        }
        data[posição] = valor;
    }
    //. retornar o valor da possicao especifica 
    public int getData(int posição){
        if (posição < 0 || posição >= tamanhoAtual) {
            System.out.println("Posição inválida.");
            return -1;
        }
        return data[posição];
    }
    //. retornar o tamanho da lista
    public int getSize(){
        return tamanhoAtual;
    }
    // Busca por um valor na lista e retorna sua posição, ou -1 se não encontrar
    public int find(int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (data[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    //. exibir a lista
    public void display(){
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}