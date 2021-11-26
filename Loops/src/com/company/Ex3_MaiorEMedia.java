package com.company;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int media = 0;
        int maior = 0;
        int cont = 0;
        System.out.println("Informe cinco números:");

        do {
            numero = scan.nextInt();
            media += numero;
            if (numero > maior){
                maior = numero;
            }
            cont = cont + 1;
        }while(cont < 5);

        media = media / 5;

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);
    }
}
