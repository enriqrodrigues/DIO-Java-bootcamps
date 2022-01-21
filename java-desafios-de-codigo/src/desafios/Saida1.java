package desafios;

public class Saida1 {
    public static void main(String[] args) {
        for (int i = 0; i < 39; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("\n|");
            for (int x = 0; x < 37; x++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.print("\n");
        for (int i = 0; i < 39; i++) {
            System.out.print("-");
        }
    }
}
