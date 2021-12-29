package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        //LIST
        /*
        List - Permite elementos duplicados e garante ordem de inserção.
        > ArrayList - Deve ser usado mais onde operações de pesquisa são necessárias. Usa um array dinâmica para
        armazenar os elementos.
        > Vector.
        > LinkedList - Deve ser usado onde mais operações de inserção e exclusão são necessárias. Usa uma
        lista duplamente encadeada para armazenar os elementos.
         */

        //Inicializando uma lista
        List notas0 = new ArrayList();
        List<Double> notas1 = new ArrayList<Double>();      //Forma mais usual
        ArrayList<Double> notas2 = new ArrayList<>();
        List<Double> notas3 = new ArrayList<>(Arrays.asList(4.4d, 5.5d, 6.6d, 7.7d, 8.8d, 9.9d, 8.8d));
        List<Double> notas4 = List.of(5.5d, 6.6d, 9.9d);      //Essa forma não permite inclusão/exclusão de
        // elementos

        //Manitpulando as listas
        notas1.addAll(notas3);      //Adiciona todos os elementos de uma outra Lista.
        notas1.add(6.6d);           //Adiciona o elemento passado como parâmetro.
        notas1.add(3, 7.7d);    //Adiciona o elemento no índice passado.
        notas1.remove(6.6d);    //Retira o primeiro elemento igual ao passado como parâmetro.
        notas1.remove(1);    //Remove o elemento do índice passado.
        notas1.removeAll(notas4);   //Remove todos os elementos que exitem em outra lista.
        notas1.indexOf(1);          //Retorma o elemento existente no índice passado.
        notas1.get(2);              //Retona o elemento no índice passado.
        notas1.contains(7.7d);      //Verifica se a lista contêm o valor passado (retorna true/false).
        notas1.size();              //Retorna o tamanho da lista.
        notas1.clear();             //Limpar a lista.
        notas1.isEmpty();           //Verificar se a lista está vazia (retorna true/false).

        System.out.println(notas1);     //Imprime a lista completa.
        for(Double nota : notas1) System.out.println(nota); //Imprime a lista item por item.

        //Iterator - O método .iterator() varre cada posição da lista como se fosse um cursor.
        Iterator<Double> iterator = notas1.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){      //E o método hasNext verifica se há algum elemento na posição atual.
            Double next = iterator.next();  //Os elementos dentro da lista, são acessados com o método .next().
            soma += next;
        }

        //Collections - Não testado
        /*
        Collections.max(notas0);     //Restorna o maior valor.
        Collections.min(notas0);     //Restorna o menor valor.
        Collections.sort(notas0);    //Ordena de forma simples.
         */

    }
}
