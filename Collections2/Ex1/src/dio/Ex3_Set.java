package dio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex3_Set {

    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>();

        //add() adiciona um elemento
        notas.add(5.4);
        notas.add(6.2);
        notas.add(5.9);
        notas.add(9.8);
        notas.add(5.7);
        notas.add(3.4);
        System.out.println(notas);

        //remove() exclui um elemento específico
        notas.remove(3.4);
        System.out.println(notas);

        System.out.println(notas.size());

        //Navegando na lista
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator: " + iterator.next());
        }

        for (Double nota : notas) {
            System.out.println("foreach: " + nota);
        }
    }
}
