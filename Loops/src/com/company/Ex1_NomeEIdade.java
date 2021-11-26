package com.company;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome do aluno: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;
            System.out.println("Idade do aluno: ");
            idade = scan.nextInt();
            System.out.println("Dados do aluno: " + nome + ", " + idade + " anos");
        }

        System.out.println("Programa encerrado.");

    }
}
