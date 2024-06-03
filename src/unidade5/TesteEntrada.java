package unidade5;
import javax.swing.JOptionPane;
public class TesteEntrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o salário"));
        double salarioLiquido = salario * 0.89;
        String resultado = "Nome: " + nome + "\n" +
                "Salário Bruto: R$ " + salario + "\n" +
                "Salário Líquido: R$ " + salarioLiquido;        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
