package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class D2_GraosDeTrigo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                   //Entrada: Nùmero de casos de teste
        for (int i = 0; i < n; i++) {           //Loop de casos de teste
            int x = sc.nextInt();               //Entrada: Número de quadrados do tabuleiro
            BigInteger qtdGraos = BigInteger.valueOf(0);    //Iniciando a qtd de grãos em 0
            for (int j = 0; j < x; j++) {       //Loop para calcular a qtd de grãos
                qtdGraos = qtdGraos.add((BigInteger.valueOf(2)).pow(j));    //Calcula a qtd de graos no tabuleiro
            }
            //Lógica matemática: qtdGraos = 2^0 + 2^1 + 2^2 + .... + 2^(x-1) . Onde x = Número de quadrados do tabuleiro
            BigInteger quantKg = qtdGraos.divide(BigInteger.valueOf(12000)); //Calculo o peso em Kg.
            System.out.println(quantKg + " kg");
        }
    }
}