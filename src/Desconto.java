public class Desconto {

    public static void main(String[] args) {
        double precoOriginal = 100;
        double percentualDesconto = 10;

        double desconto = (precoOriginal * percentualDesconto) / 100;
        double valorProduto = precoOriginal - desconto;

        System.out.println("Preço Original: " + precoOriginal);
        System.out.println("Desconto:" + desconto);
        System.out.println("Valor Total: " + valorProduto);


    }
}
