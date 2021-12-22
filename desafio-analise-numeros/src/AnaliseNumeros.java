import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar  = 0;
        int negative = 0;
        int positive = 0;
        int input = 0;

        for (int i = 0; i < 5; i++ ) {
            input = leitor.nextInt();
            if(input %2 == 0)   { par++; }
            if(input %2 != 0)   { impar++; }
            if(input > 0)   { positive++; }
            if(input < 0)   { negative++; }
        }

        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positive + " positivo(s)");
        System.out.println(negative + " negativo(s)");
    }
}
