package com.collections.comparacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparavel implements Comparable<Comparavel>{

    //    INTERFACE COMPARATORS
    /*
    Interfaces:
        java.util.Comparator - Interface para definir classe com regra de ordenação.
        java.util.Comparable - Interface para definir regra de ordenação em uma classe de domínio.
    Algoritmos de ordenação.
    Utilizado primariamente em java.util.List.
    Permite a ordenação de objetos complexos (criados pelo usuário).

    A interface Comparable (com o método compareTo) deve ser implementado dentro da classe que se deseja ordenar.
    Exemplo:
    Se quisermos ordenar uma lista de Estudantes. Vamos criar uma classe Estudante e implementar uma interface
    Comparable<Estudante> dentro da classe. Então iremos inserir o método compareTo().
     */

    private String nome;
    private Integer nota;

    //Construtor, Getters and Setters
    public Comparavel(String nome, Integer nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNota() {
        return nota;
    }
    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\nnome = " + nome +
                ", nota = " + nota +
                ';';
    }

    @Override
    public int compareTo(Comparavel o) {
        return this.getNota() - o.getNota();
    /*
    O método compareTo() compara o objeto atual com outro e retorna um número que pode ser:
    •	Positivo - indica que o objeto atual é maior que o objeto comparado;
    •	Negativo - indica que o objeto atual é menor que o objeto comparado;
    •	Zero - indica que o objeto atual é igual ao objeto comparado.
     */
    }

    public static void main(String[] args) {
        List<Comparavel> alunos = new ArrayList<>();
        alunos.add(new Comparavel("Pedro", 5));
        alunos.add(new Comparavel("Jose", 6));
        alunos.add(new Comparavel("Maria", 4));
        alunos.add(new Comparavel("Diego", 8));
        alunos.add(new Comparavel("Luiz", 9));
        alunos.add(new Comparavel("Juliana", 3));
        System.out.println(alunos);

        //Ordenar pela nota
        alunos.sort((e1, e2) -> e1.getNota() - e2.getNota());   //Lambda
        System.out.println(alunos);
        alunos.sort((e1, e2) -> e2.getNota() - e1.getNota());   //Lambda (Ordem inversa)
        System.out.println(alunos);

        alunos.sort(Comparator.comparingInt(Comparavel::getNota));  //Reference Method
        System.out.println(alunos);
        alunos.sort(Comparator.comparingInt(Comparavel::getNota).reversed());  //Reference Method (Ordem inversa)
        System.out.println(alunos);

    }
}
