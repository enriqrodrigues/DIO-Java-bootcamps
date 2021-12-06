package dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        System.out.println(" -- Ordem de Inserção --");
        System.out.println(estudantes);

        //Reordenando a lista com a sintaxe lambda.
        System.out.println(" -- Ordem Natural (Idade) --");
        estudantes.sort((e1, e2) -> e1.getIdade() - e2.getIdade());
        System.out.println(estudantes);
        System.out.println(" -- Ordem Inversa (Idade) --");
        estudantes.sort((e1, e2) -> e2.getIdade() - e1.getIdade());
        System.out.println(estudantes);

        //Reordenando a lista com o method reference
        System.out.println(" -- Ordem Natural (Idade) --");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);
        System.out.println(" -- Ordem Inversa (Idade) --");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        //Reordenando com a classe collections
        //Aqui o sort trabalha com a regra definida na classe EstudanteComparator
        System.out.println("-- Ordem natural (Idade - Comparable)");
        Collections.sort(estudantes, new EstudanteComparator());
        System.out.println(estudantes);

    }
}
