public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        String nomeDoFilme = "Top Gun - Maverick";
        System.out.println("Filme: " + nomeDoFilme);

        int anoDeLancamento= 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // media calculada pelas tres notas existentes
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme dos anos 90";
        System.out.println(sinopse);

        int classificacao = (int) (media / 2); //informando ao compilador de que obrigatoriamente o valor da variavel classificacao precisa ser um int
        System.out.println(classificacao);
    }
}