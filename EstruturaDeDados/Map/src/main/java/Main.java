import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();            //Map<Chave, Valor>
        aluno.put("Nome", "João");
        aluno.put("Idade", "35");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();            //Map<Chave, Valor>
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "29");
        aluno2.put("Media", "9.5");
        aluno2.put("Turma", "5b");

        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
