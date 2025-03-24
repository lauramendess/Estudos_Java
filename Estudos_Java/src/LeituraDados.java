import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        int numero;
        int posicao;
        float numero2;
        String jogo;
        String musica;
        String ranking;
        String campeao;
        String valor;

        // Scanner -> classe. Cria um objeto leitor para ler valores digitados do teclado
        Scanner leitor = new Scanner(System.in);
        // Configurando (definido que os separadores é ; ou \r ou \n)
        leitor.useDelimiter("[;\r\n]+");

        // INT
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        System.out.println("Número 1: " + numero);

        // FLOAT
        System.out.println("Digite outro número: ");
        numero2 = leitor.nextFloat();
        System.out.println("Número 2: " + numero2);

        // STRING
        System.out.println("Qual o seu jogo do momento?");
        jogo = leitor.next();
        System.out.println("O jogo do momento é " + jogo);

        // LIMPA BUFFER
        leitor.nextLine();

        System.out.println("Qual a sua música do momento?");
        musica = leitor.nextLine();
        System.out.println("A música do momento é " + musica);

        // LIMPA BUFFER
        leitor.nextLine();

        // MAIS COMPLEXO
        System.out.println("Qual o seu elo?");
        ranking = leitor.nextLine();

        System.out.println("Qual o seu tier?");
        valor = leitor.nextLine();
        posicao = Integer.parseInt(valor); // convertendo a string para int

        System.out.println("Qual o seu campeão preferido?");
        campeao = leitor.nextLine();

        System.out.println("Você é mono " + campeao + " no elo " + ranking + " " + (posicao + 1));

        // FECHANDO O SCANNER
        leitor.close();
    }
}
