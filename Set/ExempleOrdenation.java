package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExempleOrdenation {
    public static void main(String[] args) {

        // Ordem Aleatória
        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> series = new HashSet<>() {
            {
                add(new Serie("Got", "Fantasy", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("That '70s Show", "Comédia", 25));
            }
        };
        for (Serie serie : series)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem de Inserção
        System.out.println("--\tOrdem de Inserção\t--");
        Set<Serie> series2 = new LinkedHashSet<>() {
            {
                add(new Serie("Got", "Fantasy", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("That '70s Show", "Comédia", 25));
            }
        };
        for (Serie serie : series2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem Natural (Episodio) - Interface Comparable
        System.out.println("--\tOrdem Natural (Interface Comparable)\t--");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie : series3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem Nome/Genero/TempoEpisodio - Interface Comparator
        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio (Interface Comparator)\t--");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series);
        for (Serie serie : series4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem Genero - Interface Comparator
        System.out.println("--\tOrdem Genero (Interface Comparator)\t--");
        Set<Serie> seriesGenero = new TreeSet<>(new ComparatorGenero());
        seriesGenero.addAll(series);
        for (Serie serie : seriesGenero)
            System.out.println(serie.getGenero());

        // Ordem Tempo de Episodio - Interface Comparator
        System.out.println("--\tOrdem Tempo de Episodio (Interface Comparator)\t--");
        Set<Serie> seriesTempoEpisodio = new TreeSet<>(new ComparatorTempoEpisodio());
        seriesTempoEpisodio.addAll(series);
        for (Serie serie : seriesTempoEpisodio)
            System.out.println(serie.getNome() + " - " + serie.getTempoEpisodio());

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0)
            return nome;
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0)
            return genero;
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}