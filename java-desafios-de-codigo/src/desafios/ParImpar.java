package desafios;
import java.io.IOException;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int numero = leitor.nextInt();
                                //Testa se o número é par ou ímpar.
            String paridade;
            if((numero%2)==0){
                paridade = "EVEN";
            } else {
                paridade = "ODD";
            }
                                //Testa se o número é positivo ou negativo.
            String sinal;
            if(numero<0){
                sinal = "NEGATIVE";
            }else{
                sinal = "POSITIVE";
            }
                                //Se o número for 0 ele escreve o texto padrão "NULL".
            if(numero == 0){
                paridade = "NULL";
                sinal = "";
            }
            System.out.println(paridade + " " + sinal);
        }
    }
}