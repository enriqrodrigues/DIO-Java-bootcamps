package com.company;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 10 para calcular a  tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);
        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    }
}
