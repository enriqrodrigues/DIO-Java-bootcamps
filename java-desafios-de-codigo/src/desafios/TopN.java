package desafios;

import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        int rank = scan.nextInt();

        for (int i = 0 ; i < TOPS.length ; i++) {
            if (rank == TOPS[i]) {
                System.out.println("Top " + TOPS[i]);

            } else if (rank > TOPS[i] && rank <TOPS[i + 1]){
                System.out.println("Top " + TOPS[i+1]);
            }
        }
    }
}
