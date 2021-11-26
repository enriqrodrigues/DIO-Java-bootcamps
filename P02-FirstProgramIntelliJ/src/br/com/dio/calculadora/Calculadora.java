package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrai = subtrai(a, b);
        int multiplica = multiplica(a, b);
        double divide = divide(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtrai);
        System.out.println("Multiplicação: " + multiplica);
        System.out.println("Divisão: " + divide);

    }

    public static int soma(int a, int b){
        return a + b;
    }
    public static int subtrai(int a, int b){
        return a - b;
    }
    public static int multiplica(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        return a / b;
    }
}
