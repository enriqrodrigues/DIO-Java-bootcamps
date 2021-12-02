package dio;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("c0");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(4));

        for(int i = 0; i < 20; i++){
            System.out.println(minhaLista.get(i));
        }
    }
}
