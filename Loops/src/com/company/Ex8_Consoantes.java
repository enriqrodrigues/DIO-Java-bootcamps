package com.company;
import java.util.Scanner;
public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        System.out.println("Digite 6 letras seguidas de 'Enter': ");
        int cont = 0;
        do {
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[qtdConsoantes] = letra;
                qtdConsoantes++;
            }
            cont++;
        }while(cont<consoantes.length);

        System.out.println("Foram lidas " + qtdConsoantes + " consoantes:");
        for(int i = 0; i < qtdConsoantes; i++) {
            System.out.print(consoantes[i]);
            if (i<(qtdConsoantes-1)){
                System.out.print("; ");
            }
        }

        //Criamos um laço foreach. Declaramos uma variável String consoante, vamos varrer o array e exibir as
        // consoantes.
        /*for (String consoante : consoantes){
            if (consoante!=null){
                System.out.print(consoante + "; ");
            }
        }*/

        System.out.println(".");
    }
}
