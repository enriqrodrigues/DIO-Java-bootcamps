package desafios;

import java.util.Scanner;

public class SenhaFixa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int password = leitor.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = leitor.nextInt();
        }

        System.out.println("Acesso Permitido");

    }
}
