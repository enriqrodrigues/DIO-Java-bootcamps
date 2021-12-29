package com.others;

import java.math.BigInteger;
import java.time.LocalDate;

public class Others {
    public static void main(String[] args) {
        //BigInteger - Números muito grandes
        BigInteger x = BigInteger.valueOf(1000000000).multiply(BigInteger.valueOf(1000000000));
        BigInteger o = x;

        //LocalDate - trabalhar com datas
        LocalDate data = LocalDate.now();
        //Aqui nós chamamos a classe LocalDate e passamos que a data será atribuída quando o objeto for criado.
        LocalDate dataEnd = data.plusDays(15);
        //Aqui criamos uma variável dataEnd que receberá o valor da variável data acrescido de 15 dias.

        //Saída de dados
        System.err.println("Mensagem de Erro");







    }

}
