import java.util.Random;
import java.util.Scanner;

public class AdivinheONumeroAleatorio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre o e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens, voce acertou");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Numero digitado é menor que o numero gerado");
            } else {
                System.out.println("Numero digitado é maior que o numero gerado");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("O numero gerado foi: " + numeroGerado);
        }

    }
}
