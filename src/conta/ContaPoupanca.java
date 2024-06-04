package conta;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }
    
    public void reajustar(double percentual) {
        double saldoAtual = this.getSaldo();
        double juros = saldoAtual * percentual / 100;
        this.depositar(juros);
    }
}
