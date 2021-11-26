package com.company;
import java.util.Random;
public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[20];

        System.out.println("Digite 5 números inteiros.");
        for(int i = 0; i < vetor.length; i++){
            int numero = random.nextInt(100);
            vetor[i] = numero;
        }

        System.out.println("Números e seus sucessores:");
        for(int j = 0; j < vetor.length; j++){
            System.out.println(vetor[j] + ", " + (vetor[j]+1));
        }
    }
}
