public class Temperatura {

    public static void main(String[] args) {
        double celsius = 40;
        double fah;
        int temperatura;

        fah = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit",celsius, fah);

        System.out.println(mensagem);

        temperatura = (int) fah;

        System.out.println("Temperatura é: " + temperatura);
    }
}
