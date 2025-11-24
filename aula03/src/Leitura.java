import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme");
        String filme = leitura.nextLine();

        System.out.println("Qual ano lançamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(); // Adiciona uma linha em branco
        System.out.println("Filme: " + filme);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
    }
}
