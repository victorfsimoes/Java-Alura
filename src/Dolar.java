public class Dolar {

    public static void main(String[] args) {
        double valorEmDolares = 50.6;
        double cambio = 4.94;

        double valorEmReais =  valorEmDolares * cambio;

        System.out.println(String.format("O valor em reais é: %.2f" , valorEmReais));
    }
}
