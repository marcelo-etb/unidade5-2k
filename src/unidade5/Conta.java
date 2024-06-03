package unidade5;

public class Conta {
    private int numero;
    static int quantidade;
    
    public Conta() {
        Conta.quantidade++;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
