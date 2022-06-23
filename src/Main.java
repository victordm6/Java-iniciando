public class Main {
    public static void main(String[] args) {

        System.out.println("\nCalculadora:");
        
        Calculadora.soma(2, 241);
        Calculadora.subtracao(120, 33);
        Calculadora.multiplica(8571.43, 2);
        Calculadora.divisao(2, 10);

        System.out.print("\nMensagem: \n");

        Mensagem.mensagemDia(8);
        Mensagem.mensagemDia(14);
        Mensagem.mensagemDia(22);
        Mensagem.mensagemDia(25);

        System.out.print("\nEmprestismo: \n");

        Emprestimo.banco(10, 10000);
        
    }
}
