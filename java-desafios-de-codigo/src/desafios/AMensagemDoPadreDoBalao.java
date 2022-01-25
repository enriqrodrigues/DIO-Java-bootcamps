package desafios;

import java.util.Scanner;

public class AMensagemDoPadreDoBalao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            String alphabet = leitor.next();
            String word = "";
            int letters = leitor.nextInt();

            for (int i = 0; i < letters; i++) {
                word = word.concat(String.valueOf(alphabet.charAt(leitor.nextInt() - 1)));
            }

            System.out.println(word);
        }

    }
}
