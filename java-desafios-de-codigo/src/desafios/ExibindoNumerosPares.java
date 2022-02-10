package desafios;

import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 2; i < input ; i += 2 ) {
            System.out.println(i);
        }
        if( input % 2 == 0 ) {
            System.out.println(input);
        }
    }
}
