import javax.swing.JOptionPane;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, soma, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        int multiplicacao = numero1 * numero2;
        JOptionPane.showMessageDialog(null, multiplicacao, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        double divisao = (double) numero1 / numero2;
        JOptionPane.showMessageDialog(null, divisao, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        int modulo = numero1 % numero2;
        JOptionPane.showMessageDialog(null, modulo, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}
