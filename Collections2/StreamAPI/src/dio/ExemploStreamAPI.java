package dio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retornar a contagem de elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        //retornar o elemento com maior número de letras
        System.out.println(("Maior nome: " + estudantes.stream()
                .max(Comparator.comparingInt(String::length))));

        //retornar o elemento com menor número de letras
        System.out.println(("Menor nome: " + estudantes.stream()
                .min(Comparator.comparingInt(String::length))));

        //retornar elementos com a letra R
        System.out.println(("Nomes que contêm R: " + estudantes.stream()
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())));

        //Retorna uma nova coleção com os nomes concatenados com a qtd de letras
        System.out.println("Nomes e qtd de letras: " + estudantes.stream()
                .map(estudante -> estudante.concat(" - ")
                        .concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        //retonar os 3 primeiros elementos
        System.out.println("Os 3 primenros: " + estudantes.stream()
                .limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma seleção
        System.out.println("Retorna os elementos: " + estudantes.stream()
                .peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento sem retornar outra coleção
        System.out.println("Retorna novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os nomes possuem a letra "W"
        System.out.println("Letra W?" + estudantes.stream()
                .allMatch((elemento) -> elemento.contains("w")));

        //Retorna true se algum dos nomes possuem a letra "h"
        System.out.println("Letra h?" + estudantes.stream()
                .anyMatch((elemento) -> elemento.contains("h")));

        //Retorna true se nenhum dos nomes possuem a letra "x"
        System.out.println("Letra h?" + estudantes.stream()
                .noneMatch((elemento) -> elemento.contains("x")));

        //retorna o primeiro elemento e exibe
        System.out.println("Primeiro elemento: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(
                        String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        //        .collect(Collectors.joining(", ")));
        //        .collect(Collectors.toSet()));
        //        .collect(Collectors.groupingBy(estudante -> estudante
        //        .substring(estudante.indexOf("-") + 1))));

    }
}
