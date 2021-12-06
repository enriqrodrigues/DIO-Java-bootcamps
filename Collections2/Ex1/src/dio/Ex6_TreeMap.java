package dio;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ex6_TreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Floripa");
        capitais.put("PR","Curitiba");
        capitais.put("SP","São Paulo");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("MG","Belo Horizonte");
        System.out.println(capitais);

        //retorna a chave do primeiro elemento no topo da árvore
        System.out.println(capitais.firstKey());
        //retorna a chave do último elemento no topo da árvore
        System.out.println(capitais.lastKey());

        //retorna a chave do  elemento no abaixo do elemento especificado
        System.out.println(capitais.lowerKey("RJ"));
        //retorna a chave do elemento acima do elemento especificado
        System.out.println(capitais.higherKey("RJ"));

        //retorna a chave e o valor do primeiro elemento no topo da árvore
        System.out.println(capitais.firstEntry().getKey()
                + " - "
                + capitais.firstEntry().getValue());
        //retorna a chave e o valor do primeiro elemento no topo da árvore
        System.out.println(capitais.lastEntry().getKey()
                + " - "
                + capitais.lastEntry().getValue());

        //retorna a chave e o valor do elemento abaixo do elemento especificado
        System.out.println(capitais.lowerEntry("RJ").getKey()
                + " - "
                + capitais.lowerEntry("RJ").getValue());
        //retorna a chave e o valor do elemento acima do elemento especificado
        System.out.println(capitais.higherEntry("RJ").getKey()
                + " - "
                + capitais.higherEntry("RJ").getValue());

        //Retorna e retira o primeiro elemento da árvore
        Map.Entry<String, String> primeiro = capitais.pollFirstEntry();
        System.out.println("Primeiro: " + primeiro);
        System.out.println(capitais);
        //Retorna e retira o primeiro elemento da árvore
        Map.Entry<String, String> ultimo = capitais.pollLastEntry();
        System.out.println("Último: " + ultimo);
        System.out.println(capitais);

        //NAVEGAÇÃO
        //Iterator
        Iterator<String> cidade = capitais.keySet().iterator();
        while (cidade.hasNext()){
            String chave = cidade.next();
            System.out.println(chave + " - " + capitais.get(chave));
        }
        //foreach
        for (String capital : capitais.keySet()){
            System.out.println(capital + " -- " + capitais.get(capital));
        }
        //foreach + Entry
        for(Map.Entry<String, String> capital : capitais.entrySet()){
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }

        System.out.println(capitais);
    }
}
