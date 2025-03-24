public class EstruturasdeRepeticao {

    public static void main(String[] args) {
        // FOR
        // for (<inicialização>; <condição>; <incremento>) { <bloco de código> }
        for (int i = 0; i <= 10; i++) {
            System.out.println("FOR: " + i);
        }

        // WHILE (ENQUANTO)
        // while (<condicao>) { <bloco de código> }
        int contador = 0;
        while (contador < 10) {
            System.out.println("WHILE: " + contador);
            contador++;
        }

        // DO WHILE
        // do { <bloco de código> } while (<condicao>);
        int decrescente = 100;
        do {
            System.out.println("DO WHILE: " + decrescente);
            decrescente--;
        } while (decrescente >= 90);
    }
}