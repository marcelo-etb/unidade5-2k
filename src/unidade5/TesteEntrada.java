package unidade5;
import javax.swing.JOptionPane;
public class TesteEntrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o sal�rio"));
        float imposto = Float.parseFloat(
                JOptionPane.showInputDialog("% do imposto"));
        double salarioLiquido = salario - (salario * imposto / 100);
        String resultado = "Nome: " + nome + "\n" +
                "Sal�rio Bruto: R$ " + salario + "\n" +
                "Sal�rio L�quido: R$ " + salarioLiquido;        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
