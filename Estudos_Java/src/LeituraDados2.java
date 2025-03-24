import javax.swing.JOptionPane;

public class LeituraDados2 {
    public static void main(String[] args) {
        String serie = JOptionPane.showInputDialog(null, "Qual a sua série preferida?", "Estudos Java", JOptionPane.QUESTION_MESSAGE);
        //System.out.format("A série favorita deste usuário é %s!\n", serie);

        String texto = JOptionPane.showInputDialog(null, "Digite um número:");
        int numero = Integer.parseInt(texto);
        System.out.println(numero);

        JOptionPane.showMessageDialog(null, "Série favorita: " + serie, "Estudos Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
