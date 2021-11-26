package com.company;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.println("Informe um número para cálculo fatorial:");
        numero = scan.nextInt();

        System.out.println("Fatorial de " + numero + " é:");
        System.out.print(numero + "! = ");

        for(int i = numero; i > 1; i--){
            System.out.print(i + " x ");
            resultado = resultado * i;
        }
        System.out.println("1 = " + resultado);
    }
}
