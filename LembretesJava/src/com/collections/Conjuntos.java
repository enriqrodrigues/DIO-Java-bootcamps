package com.collections;

import java.util.*;

public class Conjuntos {
    public static void main(String[] args) {

        //SET
        /*
        •	Não permite elementos duplicados;
        •	Não possui índice, ou seja, não existem método que trabalhem com índice;

        HashSet
            Usa internamente um HashMap para armazenar os elementos.
            Não mantêm a ordem dos elementos.
            Possui melhor performance que o LinkedHashSet e o TreeSet.
            Permite até um elemento null.
        LinkedHashSet
            Usa internamente um LinkedHashMap para armazenar os elementos.
            Mantêm a ordem de inserção dos elementos.
            Possui melhor performance que o TreeSet.
            Permite até um elemento null.
        TreeSet
            Usa internamente um TreeMap para armazenar os elementos.
            Ordena os elementos de forma natural.
            Possui pior performance que o HashSet e o LinkedHashSet.
            Não permite nenhum elemento null.
         */

        //Iniciando um Set
        Set<Double> notas = new HashSet<>(Arrays.asList(4.4d, 5.5d, 6.6d, 7.7d, 8.8d, 9.9d));
        Set notas0 = new HashSet();
        HashSet<Double> notas1 = new HashSet<>();
        Set<Double> notas2 = new HashSet<>();
        Set<Double> notas3 = Set.of(1.1d, 2.2d, 3.3d, 4.4d, 5.5d, 6.6d);

        //Manitpulando as listas
        notas.addAll(notas3);      //Adiciona todos os elementos de um outro Set.
        notas1.add(7.7d);           //Adiciona o elemento passado como parâmetro.
        notas.remove(6.6d);    //Retira o primeiro elemento igual ao passado como parâmetro.
        notas.removeAll(notas1);   //Remove todos os elementos que exitem em outra lista.
        notas1.contains(7.7d);      //Verifica se a lista contêm o valor passado (retorna true/false).
        notas1.size();              //Retorna o tamanho da lista.
        notas1.clear();             //Limpar a lista.
        notas1.isEmpty();           //Verificar se a lista está vazia (retorna true/false).

        System.out.println(notas);     //Imprime a lista completa.
        for(Double nota : notas) System.out.println(nota); //Imprime a lista item por item.

        //Iterator - O método .iterator() varre cada posição da lista como se fosse um cursor.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){      //E o método hasNext verifica se há algum elemento na posição atual.
            Double next = iterator.next();  //Os elementos dentro da lista, são acessados com o método .next().
            soma += next;
        }

    }
}
