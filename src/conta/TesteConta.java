package conta;

public class TesteConta {

    public static void main(String[] args) {
        Conta c = new Conta(123456, "Marcelo", 1000); 
        c.depositar(100);
        c.depositar(50);
//        c.setNomeTitular("Marcelo");
//        c.setNumero(123456);
        boolean saqueEfetuado = c.sacar(300);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("ERRO AO SACAR!!!");
        }
//        System.out.println("Nome Titular: " + c.getNomeTitular());
//        System.out.println("Número: " + c.getNumero());
//        System.out.println("Saldo: " + c.getSaldo());

        ContaEspecial ce = new ContaEspecial(456, "Priscila", 500);
        if (ce.sacar(100)) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("Saldo insuficiente para efetuar saque!");
        }
        
        System.out.println(c);
        System.out.println(new ContaPoupanca(123, "Virna"));
        System.out.println(ce);
    }
}
