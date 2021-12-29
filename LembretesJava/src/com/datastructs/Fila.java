package com.datastructs;

import java.util.LinkedList;

public class Fila {

    //Fila (Queue) - Regra: FIFO (First In, First Out) - O primeiro que entra é o primeiro que sai.
    {
        java.util.Queue<No> queueCar = new LinkedList<No>();
        queueCar.add(new No("Ford"));       //Adiciona um elemento na fila.
        queueCar.add(new No("Fiat"));
        queueCar.element();     //Retorna a cabeça da fila. Se a fila estiver vazia, lança uma exceção.
        queueCar.offer(new No("KIA"));      //Adiciona um elemento na fila.
        queueCar.peek();        //Retorna a cabeça da fila. Se a fila estievr vazia, retorna null.
        queueCar.remove();      //Remove a cabeça da fila. Se a fila estiver vazia, lança uma exceção.
        queueCar.poll();        //Remove a cabeça da fila. Se a fila estiver vazia, retorna null.
        queueCar.isEmpty();     //Verifica se a fila está vazia.
    }
}
