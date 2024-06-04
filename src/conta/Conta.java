package conta;

public class Conta {
    private int numero;
    private String nomeTitular;
    private double saldo;
    
    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }
    
    public void depositar(double valor) {
        // this.saldo += valor;
        this.saldo = this.saldo + valor;
    }
    
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor; // this.saldo=this.saldo - valor
            return true;
        } else
            return false;        
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public String getNomeTitular() {
        return this.nomeTitular;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Conta{" + 
                "numero=" + numero + 
                ", nomeTitular=" + nomeTitular + 
                ", saldo=" + saldo + 
                '}';
    }
    
    
}
