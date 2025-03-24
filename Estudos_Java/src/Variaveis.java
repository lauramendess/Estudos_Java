public class Variaveis {

    public static void main(String[] args) {

        // INTEIROS
        // byte pode ter o valor de -128 até 127
        byte numeroPequeno = -128;
        System.out.println(numeroPequeno);

        // short pode ter o valor de -32768 até 32767
        short numeroShort = 32767;
        System.out.println(numeroShort);

        // int pode ter o valor de -2147483648 até 2147483647
        int numeroInt = 2147483647;
        System.out.println(numeroInt);
        
        // long é bem maior do que int, precisa colocar um l no final para o computador reconhecer que é long
        long numeroLong = 9223337203685477000l;
        System.out.println(numeroLong);

        // PONTO FLUTUANTE:
        // float coloca-se um f no final
        float peso = 78.5f;
        System.out.println(peso);

        // double pode guardar valores muito grande ou muito pequeno
        double pi = 3.142879321;
        System.out.println(pi);

        // CARACTERE:
        // char guarda um único caractere, sempre dentro de ''
        char letra = 'G';
        System.out.println(letra);

        // BOOLEANA:
        // armazena dois possíveis valores, verdadeiro ou falso
        boolean estouComFome = true;
        System.out.println(estouComFome);

        // STRING:
        // String tem que começar com S maiúsculo e a palavra ou texto dentro de " "
        String nomeCompleto = "Laura Mendes";
        System.out.println(nomeCompleto);

    }
}