package com.datastructs;

public class Pilha {

    //Pilha (Stack) - Regra: LIFO (Last In, First Out) - O último que entra é o primeiro que sai.
    {
        java.util.Stack<No> stackCar = new java.util.Stack<>();
        stackCar.push(new No("Ford"));       //Adiciona um elemento na pilha.
        stackCar.push(new No("Fiat"));
        stackCar.search(new No("Fiat"));     //Verifica se tem um elemento na pilha.
        stackCar.pop();                         //retira um elemento da pilha.
        stackCar.peek();                        //exibe o elemento no topo da pilha (sem retira-lo).
        stackCar.empty();                       //verifica se a pilha está vazia ou não.
    }

}
