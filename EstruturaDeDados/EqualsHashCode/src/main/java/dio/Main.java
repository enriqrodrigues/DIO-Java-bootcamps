package dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //-----STACK-----//
        Stack<Carro> stackCarros = new Stack<>();
        System.out.println("\nTeste da Stack");

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());;

        //-----LIST-----//
        List<Carro> listaCarros = new ArrayList<>();
        System.out.println("\nTeste da List");

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("VolksWagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
