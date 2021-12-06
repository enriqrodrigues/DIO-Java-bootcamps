package dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex1_List {

    public static void main(String[] args) {
        //Para utilizar uma lista, primeiro precisamos instancia-la:
        List<String> nomes = new ArrayList<>();
        //Vamos adicionar elementos.
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Anderson");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        //Método sort() executa uma ordenação simples por texto.
        Collections.sort(nomes);
        System.out.println(nomes);

        //método set() recebe um índice e um elemento para atualizar a List.
        nomes.set(3, "Larissa");
        System.out.println(nomes);

        //método remove() recebe o índice ou o elemento para retirar.
        nomes.remove(4);
        nomes.remove("Larissa");
        System.out.println(nomes);

        //método get() recebe um índice e retorna o elemento correspondente.
        String nome = nomes.get(2);
        System.out.println("Posição 2: " + nome);

        //método size() retorna o tamanho da lista.
        int sizeList = nomes.size();
        System.out.println("Tamanho da Lista: " + sizeList);

        //Método contains() consulta se a lista contêm um elemento específico.
        boolean checkName = nomes.contains("Pedro");
        System.out.println(checkName);

        //Método isEmpty() verifica se a lista está vazia.
        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        //método indexOf() recebe um elemento e retorna a sua posição na lista.
        int posicao = nomes.indexOf("Anderson");
        System.out.println("Posição de Anderson na Lista: " + posicao);
        //Quando o elemento não existe na lista, o indexOf retorna -1.
        posicao = nomes.indexOf("Joana");
        System.out.println("Posição de Joana na Lista: " + posicao);

        //FORMAS DE NAVEGAR NA LISTA
        //for each: recebe a declaração de uma variável e recebe a lista.
        for (String nomeLista : nomes) {
            //Para cada elemento da lista, executa o código abaixo:
            System.out.println("foreach: " + nomeLista);
        }

        //Iterator?
        //Método iterator, retorna um iterator de String
        Iterator<String> itaretor = nomes.iterator();
        //O iterator pode ser navegado através do While.
        while(itaretor.hasNext()) {          //hasNext() retorna true/false sempre que houver um elemento na lista.
            System.out.println("iterator: " + itaretor.next());    //next() retorna o elemento que sendo iterado.
        }

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Mateus");
        novaLista.add("Carol");
        novaLista.add("Henrique");
        novaLista.add("Dany");

        System.out.println(nomes);
        System.out.println(novaLista);

        //método addAll() recebe uma lista a adiciona-a a lista existente.
        novaLista.addAll(nomes);
        System.out.println(novaLista);

        //método clear limpa a lista.
        nomes.clear();
    }
}
