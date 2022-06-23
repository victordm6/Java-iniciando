public class Emprestimo {

    public static void banco(double parcelas, double dinheiro){
        double juros = 1 + (parcelas / 20);
        double total = (( dinheiro * juros ) / parcelas);
        System.out.printf("Terá que pagar: R$ %.2f", total);
        System.out.print(", em " + parcelas + " parcelas!");

    }
}
