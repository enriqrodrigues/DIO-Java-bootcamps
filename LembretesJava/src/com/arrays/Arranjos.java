package com.arrays;

public class Arranjos {
    public static void main(String[] args) {

        //Arrays
        /*
        Arrays são arranjos de dados.
        Podem ser:
            Unidemensionais (somente linha ou coluna);
            Multidimensionais (várias linhas, colunas, camadas, blocos, etc).
         */

        //Array unidimensional
        int[] vetor = new int[5];   //Array de 5 posições.
        int[] vetor0 = {-5, -2, 0, 2, 5};   //Array de 5 posições inicializado com os valores.

        int a = vetor.length; //retorna o tamanho do array.
        int b = vetor[2];   //retorna o valor no índice 2.
        vetor[2] = 13;     //altera o valor de posição 2.

        //Array multidimensional
        int[][] matriz = new int[3][2];     //Matriz com 3 linhas e 2 colunas.
        int[][] matriz0 = {{0,1,0},{1,0,0}};    //Matriz com 3 linhas e 2 colunas inicializado com os valores.

    }
}
