package com.collections;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {

        //MAP
        /*
        É um objeto que pode guardar múltiplos elementos (variáveis ou outros objetos).
        Cada elemento dentro do Map deve ter uma chave e um valor.
        As chaves devem ser exclusivas para cada elemento.

        HashMap
            Ordem de interação aleatória.
            Permite chaves nulas.
        LinkedHashMap
            Ordenado conforme inserção ou acesso (definido na construção).
            Permite chaves nulas.
        TreeMap
            Ordenação natural das chaves ou por comparação (definido na construção).
            Não permite chaves nulas.
         */

        //Inicializando um Map
        Map carros = new HashMap();
        Map<Integer, String> carros0 = new HashMap<>();
        HashMap<Integer, String> carros1 = new HashMap<>();
        Map<Integer, String> carros2 = Map.of(
                1, "Gol",
                2, "Voyage",
                3, "Polo",
                4, "Virtus",
                5, "Golf",
                6, "Fox",
                7, "CrossFox",
                8, "T-Cross",
                9, "Tiguan",
                10, "Nivus");

        //Manipulando o Map
        carros.putAll(carros2);  //Adiciona elementos de um outros map ou Substitui os elementos das chaves existentes.
        carros.put(11, "SpaceFox");  //Adiciona um novo elemento ou substitui o elemento se a chave já existir.
        carros.containsKey(5);      //Verifica se a chave existe.
        carros.containsValue("Gol");    //Verifica se o elemento existe.
        carros.get(5);                  //Retorna o elemento do índice passado.
        carros.keySet();                //Retorna a lista das chaves existentes.
        carros.values();                //Retorna os valores existentes.
        carros.size();                  //Retorna o tamanho do Map.
        carros.remove(10);          //Remove o objeto com a chave passada.
        carros2.clear();                //Limpa o Map.
        carros2.isEmpty();              //Verifica se está vazio.

        System.out.println(carros);

        //Iterando o Map
        Set<Map.Entry<Integer, String>> entries = carros.entrySet();
        String carro = "";
        for(Map.Entry<Integer, String> entry : entries) {
            carro += entry.getValue() + ", ";
        }
        System.out.println(carro);

        Iterator<String> iterator = carros.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
