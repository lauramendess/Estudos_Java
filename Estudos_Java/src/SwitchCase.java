import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        String personagem = JOptionPane.showInputDialog(null, "Digite um personagem de Dragon Ball");
        String nomeImagem = " ";
        String origem = " ";

        // Switch -> escolha 
        switch (personagem) {
            case "Vegeta":
            origem = "Planeta Sayajin";
            nomeImagem = "vegeta-icone";
            break;
            
            case "Goku":
            origem = "Planeta Sayajin";
            nomeImagem = "goku-icone";
            break;

            case "Kuririn":
            origem = "Planeta Terra";
            nomeImagem = "kuririn-icone";
            break;

            case "Bulma":
            origem = "Planeta Terra";
            nomeImagem = "bulma-icone";
            break;

            case "Piccolo":
            origem = "Planeta Namekuseijin";
            nomeImagem = "piccolo-icone";
            break;

            default:
            origem = "Desconhecida";
            nomeImagem = "default";
            break;
        }

        //C:/Users/Laura Mendes/Documents/Java/Projetos Java/Estudos_Java/src/assets/%s.png, nomeImagem
        String caminhoImagem = String.format("C:/Users/Laura Mendes/Documents/Java/Projetos Java/Estudos_Java/src/assets/%s.png", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImagem);

        String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
    }
}
