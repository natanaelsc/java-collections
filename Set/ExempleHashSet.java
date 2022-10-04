package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExempleHashSet {
    
    public static void main(String[] args) {
        
        Set<Double> notas = new HashSet<>();

        // Inserção
        notas.add(5.8);
        notas.add(8.6);
        notas.add(7.4);
        notas.add(5.6);
        notas.add(6.5);
        notas.add(8.0);
        notas.add(10.0);

        System.out.println(notas);

        // Remoção
        notas.remove(5.6);
        System.out.println(notas);

        // Tamanho
        System.out.println(notas.size());

        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double nota: notas) {
            System.out.println(nota);
        }

        // Limpa
        notas.clear();

        // Lista Vazia
        System.out.println(notas.isEmpty());
    }
}
