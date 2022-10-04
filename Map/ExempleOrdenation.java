package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExempleOrdenation {
    public static void main(String[] args) {

        // Ordem Aleatória
        System.out.println("\n--\tOrdem Aleatória\t--");
        Map<String, Livro> livros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : livros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        // Ordem de Inserção
        System.out.println("\n--\tOrdem de Inserção\t--");
        Map<String, Livro> livros2 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) 
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        // Ordem Alfabética nome dos Autores
        System.out.println("\n--\tOrdem Alfabética nome dos Autores\t--");
        Map<String, Livro> livros3 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro : livros3.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        // Ordem Alfabética nome dos Livros
        System.out.println("\n--\tOrdem Alfabética nome dos Livros\t--");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNomeLivro());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro : livros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        
        // Ordem número de páginas
        System.out.println("\n--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livro>> livros5 = new TreeSet<>(new ComparatorNumerosDePaginas());
        livros5.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro : livros5)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }

}

class ComparatorNumerosDePaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro2.getValue().getPaginas().compareTo(livro1.getValue().getPaginas());
    }

}