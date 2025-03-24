import java.util.Random;

import javax.swing.JOptionPane;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //int dado6Faces = 1 + (int) (Math.random() * 6);   
        //JOptionPane.showMessageDialog(null, dado6Faces);    

        // MELHOR ABORDAGEM:
        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1; // 6 é o maior número e 1 é o mínimo
        JOptionPane.showMessageDialog(null, numero);
    }
}
