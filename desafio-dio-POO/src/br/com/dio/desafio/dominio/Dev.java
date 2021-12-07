package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        //copia todos os conteudos do bootcamp para conteudosInscritos.
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //Adiciona o dev no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir () {
        //Pega o primeiro curso/mentoria do conteudosInscritos.
        Optional<Conteudo> conteudoAtual = this.conteudosInscritos.stream().findFirst();
        //vamos criar uma lógica que move o curso/mentoria de conteudosInscritos para conteudosConcluidos.
        if (conteudoAtual.isPresent()) {
            this.conteudosConcluidos.add(conteudoAtual.get());
            this.conteudosInscritos.remove(conteudoAtual.get());
        } else {  //Se conteudoAtual estiver vazio, retornamos um erro
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
            return this.conteudosConcluidos
                    .stream()
                    .mapToDouble(Conteudo::calcularXp)
                    .sum();
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
