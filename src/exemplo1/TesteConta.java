package exemplo1;
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = null;
        String menu = "Selecione o tipo de conta\n"
                + "1 - Conta Comum\n"
                + "2 - Conta Especial\n"
                + "3 - Conta Poupança";
        int tipoConta = Integer.parseInt(
                JOptionPane.showInputDialog(menu));
        switch (tipoConta) {
            case 1: c = new Conta(); break;
            case 2: c = new ContaEspecial(); break;
            case 3: c = new ContaPoupanca(); break;
            default: JOptionPane
                .showMessageDialog(null, "Tipo inválido!");
        }
        if (c != null) {
            c.imprimeTipoConta();
        }
    }
}
