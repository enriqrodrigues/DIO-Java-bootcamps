package desafios;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaSaida = sc.nextInt();
        int tempoViagem = sc.nextInt();
        int fuso = sc.nextInt();

        int horaChegada = horaSaida + tempoViagem + fuso;
        if(horaChegada>24){
            horaChegada -= 24;
        }

        System.out.println(horaChegada);

        sc.close();
    }
}
