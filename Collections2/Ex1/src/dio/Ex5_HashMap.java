package dio;

import java.util.HashMap;
import java.util.Map;

public class Ex5_HashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFIFA = new HashMap<>();
        campeoesMundiaisFIFA.put("Brasil", 5);
        campeoesMundiaisFIFA.put("Alemanha", 4);
        campeoesMundiaisFIFA.put("Itália", 4);
        campeoesMundiaisFIFA.put("Urugual", 2);
        campeoesMundiaisFIFA.put("Argentina", 2);
        campeoesMundiaisFIFA.put("França", 2);
        campeoesMundiaisFIFA.put("Inglaterra", 1);
        campeoesMundiaisFIFA.put("Espanha", 1);
        System.out.println(campeoesMundiaisFIFA);

        //put() adiciona ou atualiza um elemento
        campeoesMundiaisFIFA.put("Bélgica", 1);
        System.out.println(campeoesMundiaisFIFA);

        //get() retorna o valor da chave informada
        System.out.println(campeoesMundiaisFIFA.get("Itália"));

        //contaisKey retorna se existe a chave especificada
        System.out.println(campeoesMundiaisFIFA.containsKey("França"));

        //remove() o item da chave especificada
        campeoesMundiaisFIFA.remove("França");
        System.out.println(campeoesMundiaisFIFA);

        //contaisValue retorna se existe um valor especificado
        System.out.println(campeoesMundiaisFIFA.containsValue(4));

        //Navegando nos registro do Map
        //entrySet
        for (Map.Entry<String, Integer> campeao : campeoesMundiaisFIFA.entrySet()) {
            System.out.println(campeao.getKey() + " -- " + campeao.getValue());
        }
        //keySet
        for (String campeao : campeoesMundiaisFIFA.keySet()){
            System.out.println(campeao + " -- " + campeoesMundiaisFIFA.get(campeao));
        }

        System.out.println(campeoesMundiaisFIFA.size());

        campeoesMundiaisFIFA.clear();

    }
}
