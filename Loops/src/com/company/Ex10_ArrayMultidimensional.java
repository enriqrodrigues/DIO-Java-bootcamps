package com.company;

import java.util.Random;

public class Ex10_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int linha = 0; linha<matriz.length; linha++){
            for(int coluna = 0; coluna<4; coluna++){
                int numero = random.nextInt(9);
                matriz[linha][coluna] = numero;
            }
        }

        for(int linha = 0; linha<matriz.length; linha++){
            for(int coluna = 0; coluna<matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna]);
                if(coluna<(matriz.length-1)){
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
