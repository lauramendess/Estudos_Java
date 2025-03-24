public class Condicoes {

    public static void main(String[] args) {
        /*
         > - maior que
         < - menor que
         <= - menor ou igual a 
         >= - maior ou igual a
         == - igual a
         != - diferente de

         && - AND (E)
         || - OR (OU)
         ! - NOT (NÃO)
        */

        String video = "HunterXHunter";

        String categoria = (video == "HunterXHunter") ? "anime" : "série";
        
        System.out.println(categoria);
    }
}
