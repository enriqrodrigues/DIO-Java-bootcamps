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
		
		int soma = soma(a,b);
		int subtrai = subtrai(a,b);
		float divide = divide(a,b);
		int multiplica = multiplica(a,b);
		
		System.out.println(soma);
		System.out.println(subtrai);
		System.out.println(divide);
		System.out.println(multiplica);
			
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtrai(int a, int b) {
		return a - b;
	}
	public static float divide(int a, int b) {
		return a / b;
	}
	public static int multiplica(int a, int b) {
		return a * b;
	}

}
