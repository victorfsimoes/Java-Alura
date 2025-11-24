//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlan ="plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento");
        } else {
            System.out.println("Não Lançamento");
        }

        /*
        || ou
        && e
        */

        if(incluidoNoPlano && tipoPlan.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar");
        }
    }

}