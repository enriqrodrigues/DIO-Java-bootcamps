package com.basic;

import java.sql.ClientInfoStatus;

public class EstruturasControle {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        //Estruturas de Decisão: IF; IF - ELSE; IF - ELSE - IF.
        /*
        IF: usado para realizar um teste lógico de verdadeiro o falso
        IF - ELSE: executa um bloco de código alternativo caso o teste if seja falso
        IF - ELSE - IF: Vários if - elses aninhados para verificar 3 ou mais condições.
        Verifica expressões booleanas. Não suporta expressões aritméticas.
         */

        if (a > b) {
            //Se a condição entre parênteses é verdadeira, executa este bloco.
            System.out.println("A maior que B");
        }

        if (a > b) {
            //Se a condição entre parênteses é verdadeira, executa este bloco.
            System.out.println("A maior que B");
        } else {
            //Se a condição entre parênteses é falsa, executa este bloco.
            System.out.println("A não é maior que B");
        }

        if (a > b) {
            //Se a condição entre parênteses é verdadeira, executa este bloco.
            System.out.println("A maior que B");
        } else if (a == b) {
            //Se a condição inicial é falsa, executa um novo teste.
            System.out.println("A é igual a B");
        } else if (a < b) {
            System.out.println("A é menor que B");
        }

        //Estruturas de Decisão: SWITCH
        /*
        Indica a variável a ser comparada nas expressões case.
        Recomendado para verificação de valores exatos.
         */

        String menu = "";
        switch (menu) {
            case "Home":
                //acessar página inicial.
                break;  //sai do bloco de codigo em que ele está
            case "Store":
                //acessar loja.
                break;
            case "Contact":
                //acessar página de contatos.
                break;
            case "Portfolio":
                //acessar página de portfolio.
                break;
            default:
                //Se nenhum dos casos acontecer, executa o default.
                System.out.println("página não encontrada");
        }

        //Estrutura de Decisão - Operador ternário (deve ser evitado)
        /*
        É uma representação prática de testes e comandos diretos:
        Sintaxe:    condição ? comandosTrue : comandosFalse;
        Example:    escureceu ? acender : apagar;
         */

        //int c = (a + b == 7) ? ++a : ++b;

        //Estruturas de Repetição: WHILE; DO - WHILE; FOR.
        /*
        while: executa um bloco de código repetidamente enquanto a condição for verdadeira.
        do:executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar
        se o bloco deverá ser executado novamente.
        for:usado para realizar um loop condicional de um bloco de código.
         */

        while (a < b) {
            //executa este bloco enquanto a condição for verdadeira.
            //Pode usar o continue ou break para alterar a execução.
        }

        do {
            //executa este bloco ao menos uma vez e repete enquanto a condição for verdadeira.
            //Pode usar o continue ou break para alterar a execução.
        } while (a < b);

        for (int i = a; i > b; i--) {
            //(incializa uma variável ; testa ; incrementa/decrementa)
            //Bloco é executado um determinado número de vezes conforme o teste do for.
        }

        //FOR EACH?
        int[] lista = {-2, -1, 0, 1, 2};
        for (int item : lista){
            System.out.println(item);
        }

        //Loops infinitos
        /*
        for( ; ; ){ ... }
        ou
        while(true){ ... }
        Usa-se um break dentro de um if para interromper o loop.
         */

        //Controle de fluxo dentro de um bloco de código
    /*
        continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop
        instanceof: determina se um objeto é uma instância de determinada classe, superclasse ou interface
        return: retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
     */
    }
}
