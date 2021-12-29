package com.others;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Opcional {
    //    OPTIONAL
    /*
    •	Tratamento para valores que podem ser nulos.
    •	Possui 2 estados:
        o	Presente (Quando o optional possui um valor atribuído)
        o	Vazio (Estado inicial ou um objeto nulo)
    •	Permite que você execute operações em valores que podem ser nulos sem preocupação com as famosas
    NullPointerExceptions
     */

    public static void main(String[] args) {

        //OPCIONAL COM UM VALOR PRESENTE
        System.out.println("Valor opcional que está presente");
        Optional<String> opcionalPresente = Optional.of("Valor Presente");
        opcionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente!"));

        //OPCIONAL NULO
        System.out.println("Valor opcional que não está presente");
        Optional<String> opcionalNulo = Optional.ofNullable(null);
        opcionalNulo.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente!"));

        //OPCIONAL VAZIO
        System.out.println("Valor opcional vazio");
        Optional<String> opcionalVazio = Optional.empty();
        opcionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não está presente!"));

        //OPCIONAL COM ERRO
/*        System.out.println("Valor opcional vazio");
        Optional<String> opcionalErro = Optional.of(null);
        opcionalErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente!"));
*/

        //OPCIONAL COM VALORES ALTERNATIVOS - INT, DOUBLE, LONG
        System.out.println("Valor Opcional Inteiro");
        OptionalInt.of(12).ifPresent(System.out::println);
        System.out.println("Valor Opcional Double");
        OptionalDouble.of(12.5d).ifPresent(System.out::println);
        System.out.println("Valor Opcional Longo");
        OptionalLong.of(100000L).ifPresent(System.out::println);
        System.out.println(opcionalPresente.isPresent());

        //OUTROS MÉTODOS E USOS
        //Verificar se está vazio
        opcionalPresente.isPresent();
        opcionalPresente.isEmpty();

        //Se presente, imprime
        opcionalPresente.ifPresent(System.out::println);

        //retornando o valor com o get()
        if(opcionalPresente.isPresent()){
            String valor = opcionalPresente.get();
            System.out.println(valor);
        }

        //
        opcionalPresente.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);

        //Retorna uma exceção se o opcional não estiver presente.
        opcionalPresente.orElseThrow(IllegalStateException::new);

    }
}
