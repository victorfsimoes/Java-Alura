import java.util.Scanner;

public class DesafioNumero2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.print("Digite o primeiro número: ");
        numero1  = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2  = leitor.nextInt();

        if (numero1 == numero2){
            System.out.println("Números iguais");
        } else if (numero1 > numero2) {
            System.out.println("Primeiro número é maior");
        } else {
            System.out.println("Segundo número é maior");
        }
    }
}
