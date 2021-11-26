package com.company;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0, cont = 0, numero = 0, par = 0, impar = 0;

        System.out.println("Quantos números deseja informar?");
        n = scan.nextInt();

        System.out.println("Informe " + n + " números:");
        do {
            numero = scan.nextInt();
            if((numero%2)==0){
                par += 1;
            } else {
                impar += 1;
            }
            cont += 1;
        }while(cont < n);

        System.out.println("Qtd de Números Pares: " + par);
        System.out.println("Qtd de Números Ímpares: " + impar);
    }
}
