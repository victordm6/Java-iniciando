public class Calculadora {

    public static void soma(double numero1, double numero2){
        double produto = numero1 + numero2;
        System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + produto);
    }

    public static void subtracao(double numero1, double numero2) {
        double produto = numero1 - numero2;
        System.out.println("Subtrção: " + numero1 + " - " + numero2 + " = " + produto);
        
    }
    
    public static void multiplica(double numero1, double numero2){
        double produto = numero1 * numero2;
        System.out.printf("Multiplicação: " + numero1 + " x " + numero2 + " = %.2f", produto);

    }
    public static void divisao(double numero1, double numero2){
        double produto = numero1 / numero2;
        System.out.println("\nDivisão: " + numero1 + " / " + numero2 + " = " + produto);

    }

}
