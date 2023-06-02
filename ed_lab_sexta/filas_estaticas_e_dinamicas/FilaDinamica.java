public class FilaDinamica {
    private class No {
        private int info;
        private No prox;
        public No (int i){
            info = i;
            prox = null;
        }
        public int getInfo() {
            return info;
        }
        public No getProx() {
            return prox;
        }
        public void setInfo (int i) {
            info = i;
        }
        public void setProx (No ref) {
            prox = ref;
        }
        @Override
        public String toString () {
            return "|" + info + "|->";
        }
    }
    private No prim;
    private No ult;
    private int tamanho;
    //construtor padrão só
    public boolean estaVazia() {
        return tamanho == 0;
    }
    public void enfileira (int i) {
        No novo = new No(i);
        if (estaVazia())
            prim = novo;
        else 
            ult.setProx(novo);
        ult = novo;
        tamanho++;
    }
    public int desenfileira () {
        int i = prim.getInfo();
        tamanho--;
        prim = prim.getProx();
        if (prim == null) //esvaziou a fila
            ult = null;
        return i;
    }
    @Override
    public String toString () {
        String s = "fila: ";
        if (estaVazia()) s += "vazia";
        else {
            No runner = prim;
            while (runner != null) {
                s += runner + " ";
                runner = runner.getProx();
            }
            s += "//";
        }
        return s;
    }


    // 1) Verifica a posição de um elemento x na fila, considerando o primeiro como posição 1.

    public int buscaElemento(int elemento) {
        No runner = prim;
        int i = 0;
        while(runner != null) {
            if(runner.getInfo() == elemento) {
                return i + 1;
            }
            runner = runner.getProx();
            i++;
        }
        return -1;
    }

    // o que é o runner? é o ponteiro que vai percorrer a fila, começando do primeiro elemento
    //  o que é o No? é a classe que representa um nó da fila, com o valor e o ponteiro para o próximo nó


    // 2) A partir de duas filas existentes, realizar o merge delas; as filas originais vão desaparecer e o retorno é a fila resultante; não se esqueça que as filas podem ter tamanhos diferentes.

    
    // 3) furar fila: inserir um elemento na frente do primeiro.


    // 4) inverter fila: inverter a ordem dos elementos da fila.

    




}
