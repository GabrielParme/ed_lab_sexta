// implementação de fila sobre vetores.
public class FilaEstatica {
    private int[] dados;
    private int prim, ult, tamanho;
    public FilaEstatica() {
        this(10);
    }
    public FilaEstatica(int n) {
        dados = new int[n];
        prim = 0; ult = 0; tamanho = 0;
    }
    public boolean estaVazia() {
        return tamanho == 0;
    }
    public boolean estaCheia() {
        return tamanho == dados.length;
    }
    // o método proxima() retorna a próxima posição do vetor.
    int proxima(int pos) {
        return (pos + 1) % dados.length;
    }
    public void enfileira(int valor) {
        // iinsere o elemento no final da fila
        dados[ult] = valor;
        // último vai receber o valor de ult + 1, se o valor de ult for igual ao tamanho do vetor, ele volta para o início do vetor.
        ult = proxima(ult);
        // incrementa o tamanho da fila
        tamanho++;
    }
    public int desenfileira() {
        // pegar o primeiro elemento da fila
        int i = dados[prim];
        // incrementar o primeiro
        prim = proxima(prim);
        // decrementar o tamanho da fila
        tamanho--;
        return i;
    }
    // o método toString() retorna uma String com os elementos da fila
    @Override
    public String toString() {
        String s = "fila: ";
        if(estaVazia()){
            s += "vazia";
        }
        else{
            int i = prim;
            do{
                s += dados[i] + " ";
                i = proxima(i);
            }while(i != ult);
            
        }
        return s;
    }

    // oVetor() é um método que retorna uma String com os elementos do vetor
    public String oVetor () {
        String s = ": ";
        if (estaVazia())
            for (int i=0; i<dados.length; i++)
                s+= "_ ";
        else if (estaCheia())
            for (int i=0; i<dados.length; i++)
                s+= dados[i] + " ";
        else if (prim < ult) {
            for (int i=0; i<prim; i++)
                s+= "_ ";
            for (int i=prim; i<ult; i++)
                s+= dados[i] + " ";
            for (int i=ult; i<dados.length; i++)
                s+= "_ ";
        }
        else {//prim > ult
            for (int i=0; i<ult; i++)
                s+= dados[i] + " ";
            for (int i=ult; i<prim; i++)
                s+= "_ ";
            for (int i=prim; i<dados.length; i++)
                s+= dados[i] + " ";
        }
        return s;
    }   
    
    // 1) Verifica a posição de um elemento x na fila, considerando o primeiro como posição 1.
        public int posicao(int x) {
            int pos = 1;
            int i = prim;
            while(i != ult) {
                if(dados[i] == x) {
                    return pos;
                }
            }
            return -1;

        }

        // ou 
        
        public int buscaElemento(int elemento) {
            for(int i=0; i<dados.length; i++) {
                if(dados[i] == elemento) {
                    return i;
                }
            }
            return -1;
        }
        



    // 2) A partir de duas filas existentes, realizar o merge delas; as filas originais vão desaparecer e o retorno é a fila resultante; não se esqueça que as filas podem ter tamanhos diferentes.




    // 3) furar fila: inserir um elemento na frente do primeiro.
       public void furarFila(int x) {

       }

    // 4) inverter uma fila; dica: utilize uma pilha como variável auxiliar.
        public void inverterFila() {

        }
        
}

// Lista de Exercícios sobre Filas:
/*
 * 1. Verificar qual a posição de um elemento x na fila, considerando o primeiro como posição 1.
 * 2. A partir de duas filas existentes, realizar o merge delas; as filas originais vão desaparecer e o retorno é a fila resultante; não se esqueça que as filas podem ter tamanhos diferentes
 * 3. furar fila: inserir um elemento na frente do primeiro
 * 4. inverter uma fila; dica: utilize uma pilha como variável auxiliar
 * 5. Considere uma fila F vazia para a qual foram executados 32 enfileiramentos, 15
    desenfileiramentos, 5 dos quais geraram fila vazia. Qual o tamanho atual de F
    6. Se a fila da questão 5 foi implementada com um vetor de tamanho 30, sem nunca
    ter dado fila cheia, quais os possíveis valores de prim e ult?
    7. Numa fila de pessoas cuja identificação é dada por um papelzinho contendo um valor inteiro que não se repete, entregue quando as pessoas chegaram, alguém do atendimento resolveu fazer algo diferente: verificou quem tinha o menor valor em mãos e atendeu. As pessoas que estavam atrás dela deram um passinho para frente. Construir um método que implementa esse procedimento. Note que você vai mexer diretamente no vetor da estrutura ou na lista ligada. Fique atento também aos parâmetros do método e à forma de passá-los. E, finalmente, não
    se esqueça, você está trabalhando com uma abstração de fila.
 */

 // 1)
   

// 2)


  

