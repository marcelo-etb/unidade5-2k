package unidade5;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.setNumero(123);
        c2.setNumero(456);
        
        System.out.println("Qtd. Contas abertas: " + Conta.quantidade);
    }
}
