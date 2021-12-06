package dio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex2_Queue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        //poll retorna e remove a cabeça da fila
        String clienteAtendendo = filaBanco.poll();
        System.out.println(clienteAtendendo);
        System.out.println(filaBanco);

        //peek retorna a cabeça da fila, mas não remove
        String clienteProximo = filaBanco.peek();
        System.out.println(clienteProximo);
        System.out.println(filaBanco);

        //element funcione como o peek, mas retona uma exceção se a fila estiver vazia
        String clienteProximoComErro = filaBanco.element();
        System.out.println(clienteProximoComErro);
        System.out.println(filaBanco);

        //NAVEGANDO NA FILA
        //for each
        for (String cliente : filaBanco) {
            System.out.println("foreach: " + cliente);
        }

        //Iterator
        Iterator<String> cliente = filaBanco.iterator();
        while(cliente.hasNext()){
            System.out.println("iterator: " + cliente.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());
    }
}
