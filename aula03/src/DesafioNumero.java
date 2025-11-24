import java.util.Scanner;

public class DesafioNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero = 0;

        System.out.println("Digite o número");
        numero = leitor.nextDouble();

        if (numero > 0){
            System.out.println("positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
