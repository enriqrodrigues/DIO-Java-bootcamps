package desafios;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String strInput = leitor.next();

        double numInput = Double.parseDouble(strInput);

        if(strInput.contains("-")) {
            System.out.printf("%.4E", numInput);
        } else {
            System.out.printf("+%.4E", numInput);
        }

        //Eu passei umas 6 horas trabalhando na lógica abaixo, pra no fim descobrir que dá pra resolver apenas com formatação da saída.
        /*
        String strInput = leitor.next();

        double numInput = Double.parseDouble(strInput);
        String[] arrInput = strInput.split("");

        //Usaremos para formatar a saída.
        DecimalFormat df1 = new DecimalFormat("0,0000");  //no programa final ficou "0.0000"
        DecimalFormat df2 = new DecimalFormat("00");

        //Dados de saída
        String sinalNum = "";
        double numero = 0.0;
        String sinalExp = "+";
        int expoente = 0;

        //A variável auxiliar é usada nos índices e nas operações aritméticas conforme o sinal do número informado.
        int aux = 1;

        //Define o sinal positivo ou negativo
        if (numInput > 0) {
            sinalNum = "+";
        } else {
            aux = 2;
        }

        // >>> Definindo o número <<<
        //Verifica se tem vírgula
        if (strInput.contains(".")) {

            //Verifica se a vírgula está numa posição incorreta e cálcula o expoente e o valor decimal.
            if (strInput.indexOf(".") != aux) {
                expoente = strInput.indexOf(".") - aux;
                numero = numInput / (Math.pow(10, expoente));
            } else {

                //Se a vírgula já estiver na posição correta, verificamos se ela é antecedida de zero.
                if (arrInput[aux-1].equals("0")) {

                    //Calcula o expoente e valor decimal.
                    int i = aux+1;
                    while (arrInput[i].equals("0") && i != strInput.length() - 1) {
                        i++;
                    }
                    if (i < strInput.length() - 1) {
                        sinalExp = "-";
                        expoente = i - aux;
                    }
                    numero = numInput * (Math.pow(10, expoente));
                } else {

                    //A vírgula está na posição correta e não é antecedida de zero.
                    numero = numInput;
                }
            }
        } else {
            //Se não tem vírgula, calcular o expoente e o número.
            expoente = strInput.length() - aux;
            numero = numInput / (Math.pow(10, expoente));
        }

        //Imprimimos a saída
        System.out.println(sinalNum + df1.format(numero * 10000) + "E" + sinalExp + df2.format(expoente));

        //no programa final retirei a "* 10000"

         */
    }
}
