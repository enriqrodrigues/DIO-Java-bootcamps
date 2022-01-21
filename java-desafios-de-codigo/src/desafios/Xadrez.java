package desafios;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((L % 2 + C % 2) % 2 == 0)     //%2 testa se as entradas são pares ou ímpares.
            System.out.println("1");  //se ambas as entradas forem par ou ímpar, a saída será 1.
        else
            System.out.println("0");  //se uma entrada for par e a outra ímpar, a saída será 0.
        sc.close();
    }
}
