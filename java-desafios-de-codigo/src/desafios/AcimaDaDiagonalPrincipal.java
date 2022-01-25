package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AcimaDaDiagonalPrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String op = leitor.next();
        double soma = 0.0;
        int N = 66;

        int [][] matrix = new int[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++){
                matrix[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++){
                if( j > i){
                    soma += matrix[i][j];
                }
            }
        }

        DecimalFormat df = new DecimalFormat("##0.0");

        if(op.equals("S")) {
            System.out.println(df.format(soma));
        }

        if(op.equals("M")) {
            System.out.println(df.format(soma/N));
        }

        /* Pode ser assim tbm
        if(Objects.equals(op, "S")) {
            System.out.println(soma);
        }
        */

    }
}
