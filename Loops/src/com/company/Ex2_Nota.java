package com.company;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe a nota: ");
        nota = scan.nextInt();

        while(0 > nota || nota > 10){
            System.out.println("Valor inválido. Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Valor válido recebido: " + nota);
    }
}
