package com.company;
import java.util.Scanner;
public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada;
        int[] vetor = {-5, -6, 8, 3, 7, 8};

        System.out.println("Informe cinco números: ");

        int cont1 = 0;
        while(cont1<(vetor.length)){
            vetor[cont1] = scan.nextInt();
            cont1++;
        }

        System.out.println("Ordem Inversa: ");
        int cont2 = vetor.length - 1;
        while(cont2>=0){
            System.out.print(vetor[cont2]);
            if(cont2>0) {
                System.out.print( ", ");
            }
            cont2--;
        }
    }
}
