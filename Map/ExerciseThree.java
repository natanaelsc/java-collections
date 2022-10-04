package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExerciseThree {
    public static void main(String[] args) {

        // Ordem Aleatória
        System.out.println("\n-> Ordem Aleatória");
        Map<Integer, Contato> agenda = new HashMap<>() {
            {
                put(2, new Contato("Bianca", 6666));
                put(4, new Contato("Maria", 8888));
                put(1, new Contato("João", 5555));
                put(3, new Contato("José", 7777));
            }
        };
        for (Map.Entry<Integer, Contato> contato : agenda.entrySet())
            System.out.println(
                    contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getTelefone());

        // Ordem Id
        System.out.println("\n-> Ordem Id");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        for (Map.Entry<Integer, Contato> contato : agenda2.entrySet())
            System.out.println(
                    contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getTelefone());

        // Ordem Nome
        System.out.println("\n-> Ordem Nome");
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new ComparatorOrdemNome());
        agenda3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> contato : agenda3)
            System.out.println(
                    contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getTelefone());

        // Ordem Telefone
        System.out.println("\n-> Ordem Telefone");
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new ComparatorOrdemTelefone());
        agenda4.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> contato : agenda4)
            System.out.println(
                    contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getTelefone());

        // Ordem Telefone
        System.out.println("\n-> Ordem Telefone");
        // Classe Anonima
        // Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
        //     @Override
        //     public int compare(Entry<Integer, Contato> contato1, Entry<Integer, Contato> contato2) {
        //         return Integer.compare(contato1.getValue().getTelefone(), contato2.getValue().getTelefone());
        //     }
        // });
        // Metodo Funcional
        // Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(
        //     Comparator.comparing(
        //         new Function<Map.Entry<Integer, Contato>, Integer>() {
        //             @Override
        //             public Integer apply(Entry<Integer, Contato> contato) {
        //                 return contato.getValue().getTelefone();
        //             }
        //         }
        // ));
        
        // Expressão Lambda
        Set<Map.Entry<Integer, Contato>> agenda5 = new TreeSet<>(
            Comparator.comparing(contato -> contato.getValue().getTelefone()));
        agenda5.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> contato : agenda5)
            System.out.println(
                    contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getTelefone());
    }
}

class Contato {
    private String nome;
    private Integer telefone;

    public Contato(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }

}

class ComparatorOrdemNome implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Entry<Integer, Contato> contato1, Entry<Integer, Contato> contato2) {
        return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
    }

}

class ComparatorOrdemTelefone implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Entry<Integer, Contato> contato1, Entry<Integer, Contato> contato2) {
        return Integer.compare(contato1.getValue().getTelefone(), contato2.getValue().getTelefone());
    }

}