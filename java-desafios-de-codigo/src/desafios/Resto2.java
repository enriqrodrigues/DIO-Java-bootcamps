package desafios;

import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 2; i < 10000; i += N) {
            if (i % N == 2) System.out.println(i);
        }
    }
}
