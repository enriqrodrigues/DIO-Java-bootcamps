package dio;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos da lista: ");
        //Opção 1 - stream + accept
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //Opção 2 - stream + lambda
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //Opção 3 - lambda
        //numerosAleatorios.forEach(s -> System.out.println(s));

        //Opção 4 - method reference
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)    //limit recebe um long que define a qtd de elementos
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme sua lista numa lista de números interos: ");
        List<Integer> collectList = numerosAleatorios.stream()
                /*.map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });*/
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os números pares maiores que 2 coloque numa lista: ");
        List<Integer> listPar = numerosAleatorios.stream()
                .map(Integer::parseInt)
                /*.filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if((i%2==0) && (i>2))
                            return true;
                        return false;
                    }
                }).collect(Collectors.toList());*/
                .filter(i -> ((i % 2 == 0) && (i > 2)))
                .collect(Collectors.toList());
        System.out.println(listPar);

        System.out.println("Exiba a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        collectList.removeIf(i -> (i%2 != 0));
        System.out.println(collectList);
    }
}
