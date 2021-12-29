package com.collections.comparacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparador implements Comparator<Comparador> {

    /*
    A interface Comparator (com o método compare) é implementada fora da classe de domínio, mas funciona de forma
    semelhante à interface Comparable.
     */

    private String nome;
    private Integer nota;

    //Construtor, Getters e Setters
    public Comparador(String nome, Integer nota) {
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
                ", nota = " + nota;
    }

    @Override
    public int compare(Comparador o1, Comparador o2) {
        return o1.getNota() - o2.getNota();
    //O método compare recebe dois objetos para comparação.
    }

}
class testeComparador {
    public static void main(String[] args) {

        List<Comparador> alunos = new ArrayList<>();
        alunos.add(new Comparador("Pedro", 5));
        alunos.add(new Comparador("Jose", 6));
        alunos.add(new Comparador("Maria", 4));
        alunos.add(new Comparador("Diego", 8));
        alunos.add(new Comparador("Luiz", 9));
        alunos.add(new Comparador("Juliana", 3));
        System.out.println(alunos);

        //Ordenar pela nota
        alunos.sort((e1, e2) -> e1.getNota() - e2.getNota());   //Lambda
        System.out.println(alunos);
        alunos.sort((e1, e2) -> e2.getNota() - e1.getNota());   //Lambda (Ordem inversa)
        System.out.println(alunos);

        alunos.sort(Comparator.comparingInt(Comparador::getNota));  //Reference Method
        System.out.println(alunos);
        alunos.sort(Comparator.comparingInt(Comparador::getNota).reversed());  //Reference Method (Ordem inversa)
        System.out.println(alunos);

    }
}