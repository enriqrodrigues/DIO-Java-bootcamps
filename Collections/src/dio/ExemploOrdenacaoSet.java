package dio;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--- Ordem Aleatória ---");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("The Modern Family", "comedy", 11));
            add(new Serie("The Good Place", "comedy", 3));
            add(new Serie("The Walking Dead", "drama", 12));
            add(new Serie("Bo Jack HorseMan", "drama", 6));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getSeasons());

        System.out.println("--- Ordem de Inserção ---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("The Modern Family", "comedy", 11));
            add(new Serie("The Good Place", "comedy", 3));
            add(new Serie("The Walking Dead", "drama", 11));
            add(new Serie("Bo Jack HorseMan", "drama", 6));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getSeasons());

        System.out.println("--- Ordem Natural (Temporadas) ---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getSeasons());

        System.out.println("--- Ordem Nome, Gênero e Temporadas ---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGenTemp());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getSeasons());
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer seasons;

    public Serie(String nome, String genero, Integer temporadas) {
        this.nome = nome;
        this.genero = genero;
        this.seasons = temporadas;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", episodios=" + seasons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        //return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(episodios, serie.episodios);
        return nome.equals(serie.nome) && genero.equals(serie.genero) && seasons.equals(serie.seasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, seasons);
    }

    @Override
    public int compareTo(Serie serie) {
        int seasons = Integer.compare(this.getSeasons(), serie.getSeasons());
        if(seasons != 0){
            return seasons;
        }else {
            int genero = this.getGenero().compareTo(serie.getGenero());
            return genero;
        }
    }
}

class ComparatorNomeGenTemp implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0)        return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0)     return genero;

        return Integer.compare(s1.getSeasons(), s2.getSeasons());
    }
}
