package dio;
public class Calculadora {

    public static String soma(int d1, int d2){
        int d0 = d1 + d2;
        String str = "Resultado da soma dos dois valores: " + d0;
        return str;
    }
    public static String subtrai(int d1, int d2){
        int d0 = d1 - d2;
        String str = "Resultado da subtração dos dois valores: " + d0;
        return str;
    }
    public static String multip(int d1, int d2){
        int d0 = d1 * d2;
        String str = "Resultado da multiplicação dos dois valores: " + d0;
        return str;
    }
    public static String divide(int d1, int d2){
        int d0 = d1 / d2;
        int resto = d1 % d2;
        String str = "Resultado da divisão dos dois valores: " + d0;
        if(resto != 0){
            str += " e sobra " + resto;
        }
        return str;
    }
}
