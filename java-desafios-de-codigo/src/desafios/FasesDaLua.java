package desafios;

import java.util.Scanner;

public class FasesDaLua {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (fim >= 0  && fim <= 2) {
            System.out.println("nova");
        }

        if (fim >= 97 && fim <= 100) {
            System.out.println("cheia");
        }

        if (fim >= 3 && fim <= 96) {

            if (inicio < fim) {
                System.out.println("crescente");
            } else {
                System.out.println("minguante");
            }
        }

    }

}
