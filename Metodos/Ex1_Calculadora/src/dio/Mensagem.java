package dio;
public class Mensagem {

    public static String mensagem(int hora) {
        String str = "";
        if((hora >= 4) && (hora < 12)){
            str = "Bom dia!";
        }
        if((hora >=12 ) && (hora < 18)){
            str = "Boa tarde!";
        }
        if((hora >= 18) && (hora < 24)){
            str = "Boa noite!";
        }
        if((hora >= 0) && (hora < 4)){
            str = "Boa noite!";
        }
        if(hora >= 25){
            str = "Horário iválido!";
        }
        return str;
    }
}
