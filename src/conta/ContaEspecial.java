package conta;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite() {
        if (this.getSaldo() < 0) {
            return this.limite + this.getSaldo();
        } else {
            return this.limite;
        }
    }    
    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() + limite >= valor) {
            this.depositar(-valor); // this.saldo=this.saldo - valor
            return true;
        } else
            return false;        
    }

    @Override
    public String toString() {
        return "ContaEspecial\n" + 
                "Número: " + getNumero() + "\n" +
                "Nome: " + getNomeTitular() + "\n" +
                "Saldo: R$ " + getSaldo() + "\n" +
                "Limite total: R$ " + limite + "\n" +
                "Limite disponível: R$ " + getLimite() + "\n" +
                "---------------------------";
    }
    
}
