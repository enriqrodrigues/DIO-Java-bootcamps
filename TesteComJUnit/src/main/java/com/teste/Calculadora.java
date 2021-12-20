package com.teste;

public class Calculadora {

//este método receberá uma expressão (exemplo: 1 + 1) e retornará a soma dos números inteiros.
    public int somar(String expressao){
        int soma = 0;
        for (String valorSomar : expressao.split("\\+"))
            soma += Integer.valueOf(valorSomar);
        System.out.println(soma);
        return soma;
    }
}
