import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {
        // Arrays armazenam vários valores do mesmo tipo
        String[] opcoes = new String[]{
            "Supernatural", // 0
            "Vingadores", // 1
            "The Witcher", // 2
            "Spider-Man", // 3
            "Sair" // 4
        };

       int opcaoEscolhida = 0;

       while(opcaoEscolhida != 4){
            opcaoEscolhida = JOptionPane.showOptionDialog(
                null, 
                "Escolha um filme ou série", 
                "Devflix", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                0
            );

            if(opcaoEscolhida != 4){
                String mensagem = "Você escolheu: " + opcoes[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, mensagem);
            }
       }
    }
}
