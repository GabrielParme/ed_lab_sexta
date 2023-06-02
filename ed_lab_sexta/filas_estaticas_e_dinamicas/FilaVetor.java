// implementação de fila sobre vetores

public class FilaVetor {
    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    // construtor padrão
    public FilaVetor() {
        valores = new int[10];
        primeiro = 0;
        ultimo = 0;
        tamanho = 0;
    }
    
    // verificar se a fila esta cheia:
    public boolean estaCheia() {
       return tamanho == valores.length;
    }

    // verificar se a fila está vazia:
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // sempre vamos inserir um elemento no final da fila.
    public void inserir(int elemento) {
         // insere o elemento no final da fila
        valores[ultimo] = elemento; 
        // se o ultimo for igual ao tamanho do vetor, ele volta para o inicio do vetor. Fila da caráter circular, ou seja, quando chega no final, volta para o início do vetor.
        ultimo = (ultimo + 1) % valores.length; 
        // se o ultimo for menor que o tamanho do vetor, ele incrementa o ultimo
        // incrementa o tamanho da fila:
        tamanho++; 
    }

    // sempre vamos remover um elemento do início da fila.
    public int remover() {
        // pegar o primeiro elemento da fila 
        int elemento = valores[primeiro];
        // incrementar o primeiro
        primeiro = (primeiro + 1) % valores.length;
        // decrementar o tamanho da fila
        tamanho--;
        return elemento;
    }
}


