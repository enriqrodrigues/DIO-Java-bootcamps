package dio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Calcule as 4 operações básicas (soma, subtração, multiplicação e divisão) de 2 valores.
        System.out.println("Calculadora");
        int valor1, valor2, hora;
        System.out.println("Informe o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        valor2 = sc.nextInt();

        System.out.println(Calculadora.soma(valor1, valor2));
        System.out.println(Calculadora.subtrai(valor1, valor2));
        System.out.println(Calculadora.multip(valor1, valor2));
        System.out.println(Calculadora.divide(valor1, valor2));

        //Exiba uma mensagem Bom dia, Boa tarde ou Boa noite conforme a hora do dia.
        System.out.println("Mensagem");
        System.out.println("Informe a hora do dia:");
        hora = sc.nextInt();
        System.out.println(Mensagem.mensagem(hora));
    }
}
