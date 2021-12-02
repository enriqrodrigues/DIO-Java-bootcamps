package dio;

public class Main {
    public static void main(String[] args) {

        ListaDuploEncadeada<String> minhaLista = new ListaDuploEncadeada<>();

        minhaLista.add("c1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");
        minhaLista.add("C6");
        minhaLista.add("C7");

        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(3, "666");

        System.out.println(minhaLista);

        System.out.println("Tamanho da Lista: " + minhaLista.size());

    }
}
