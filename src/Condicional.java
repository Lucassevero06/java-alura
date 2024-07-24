public class Condicional {
    public static void main(String[] args) {


        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Filme não tão novo");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Pode assistir");
        } else {
            System.out.println("Não pode assistir");
        }

    }
}
