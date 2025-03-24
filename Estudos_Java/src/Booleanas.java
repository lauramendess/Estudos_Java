import javax.swing.JOptionPane;

public class Booleanas {

    public static void main(String[] args) {
        int idade = 16;
        boolean resultado = idade >= 18;
        JOptionPane.showMessageDialog(null, resultado);

        String usuario = "academia-dos-devs";
        String senha = "40028922";

        String usuarioDigitado = "Laura";
        String senhaDigitada = "40028922";

        boolean loginCorreto = usuarioDigitado == usuario && senhaDigitada == senha;
        System.out.println(loginCorreto);
    }
}
