import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 10){
            System.out.print("Informe o número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Você Acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado){
                System.out.print("Número Digitado é menor que o gerado. Você tem ");
                System.out.print(10 - tentativas + " Tentativas");
                System.out.println();
            }else{
                System.out.print("Número Digitado é maior que o número gerado. Você tem ");
                System.out.print(10 - tentativas + " Tentativas");
                System.out.println();
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado){
                System.out.println("Voce perdeu");
                System.out.println("O número gerado foi: " + numeroGerado);
            }
        }



    }
}
