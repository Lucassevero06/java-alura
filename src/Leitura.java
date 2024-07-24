import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // esperando a entrada de dados
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");

        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento");

        int ano = leitura.nextInt();

        System.out.println("Qual a nota para esse filme ");

        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(nota);
    }
}
