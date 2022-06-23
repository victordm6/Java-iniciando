public class Mensagem {

    public static void mensagemDia(int horas){

        if (horas < 0 || horas > 23) {
            System.out.println("Hora invalida");
        }else if (6 <= horas & horas < 12) {
            System.out.println("Bom Dia");
        }else if (12 <= horas & horas < 18) {
            System.out.println("Boa Tarde");
        }else if (horas > 6 & horas >= 18) {
            System.out.println("Boa Noite");
        }
    
    }  
}
