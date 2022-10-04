package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExempleLinkedHashSet {
    
    public static void main(String[] args) {
        
        Set<Integer> sequencia = new LinkedHashSet<>();

        // Inserção
        sequencia.add(10);
        sequencia.add(8);
        sequencia.add(7);
        sequencia.add(4);
        sequencia.add(9);
        System.out.println(sequencia);

        // Remoção
        sequencia.remove(8);
        System.out.println(sequencia);

        // Tamanho
        System.out.println(sequencia.size());

        // Navegação
        Iterator<Integer> iterator = sequencia.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer seq: sequencia) {
            System.out.println(seq);
        }

        // Limpar
        sequencia.clear();

        // Lista Vazia
        System.out.println(sequencia.isEmpty());
    }
}
