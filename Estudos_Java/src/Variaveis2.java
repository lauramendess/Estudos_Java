public class Variaveis2 {
    public static void main(String[] args) {

        String filme = "Vingadores";
        int anoLancamento = 2015;
        int duracao = 240;
        /*
        double notaCritica = 8.7;
        char letraInicial = 'V';
        boolean foiSucesso = true;   
        */ 

        System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.");

        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);

        String texto = "O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.";
        System.out.println(texto);

        String texto2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
        System.out.println(texto2);

        String canal = "Academia dos Devs ";
        String mensagem = "Se inscreva no canal ";
        String mensagem2 = "e ative o sininho!";
        String mensagemFinal = mensagem + canal + mensagem2;
        System.out.println(mensagemFinal);
    }
}
