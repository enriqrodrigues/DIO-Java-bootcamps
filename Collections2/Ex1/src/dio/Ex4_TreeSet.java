package dio;

import java.util.Set;
import java.util.TreeSet;

public class Ex4_TreeSet {

    public static void main(String[] args) {

        TreeSet<String> capitais = new TreeSet<>();

        //Montar a árvore
        capitais.add("Porto Alegre");
        capitais.add("Floripa");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Curitiba");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);

        //first() retorna o primeiro elemento no topo da árvore
        System.out.println(capitais.first());

        //last() retorna o último elemento no topo da árvore
        System.out.println(capitais.last());

        //lower() retorna o primeiro elemento abaixo do elemento informado
        System.out.println(capitais.lower("Floripa"));

        //lower() retorna o primeiro elemento abaixo do elemento informado
        System.out.println(capitais.higher("Floripa"));

        //first() retorna o primeiro elemento no topo da árvore e remove-o
        System.out.println(capitais.pollFirst());

        //last() retorna o último elemento no topo da árvore e remove-o
        System.out.println(capitais.pollLast());

        System.out.println(capitais);
    }
}
