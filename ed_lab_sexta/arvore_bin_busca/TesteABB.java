import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();
        for (int i=1; i<=10; i++) {
            int n = r.nextInt(50);
            System.out.print(n + " ");
            abb.insere(n); 
        }
        System.out.println("\n\n" +abb.exibeEmOrdem());
        System.out.println(abb.contaNosPosOrdem());
    }
}
