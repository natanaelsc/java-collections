// Garante ordem de inserção
// Permite adição, leitura e remoção considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai
// Não permite a mudança de ordenação ou alteração do elemento

package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempleLinkedList {

    public static void main(String[] args) {
        
        // Lista Tipo First In, First Out
        Queue<String> fila = new LinkedList<>();

        // Adicionando elemento a fila
        fila.add("Pamela");
        fila.add("Patrícia");
        fila.add("Roberto");
        fila.add("Flário");
        fila.add("Natan");
        System.out.println(fila); // Exibindo fila

        String proximo = fila.poll(); // Removendo o primeiro elemento da fila
        System.out.println(proximo);
        System.out.println(fila);

        proximo = fila.peek(); // Retorna o primeiro elemento da fila
        System.out.println(proximo);
        System.out.println(fila);

        //fila.clear(); // Limpa Fila
        proximo = fila.element(); // Retorna o primeiro elemento da fila, caso lista vázia, Retorna ERRO
        System.out.println(proximo);
        System.out.println(fila);

        // Percorrer Fila com Foreach
        for (String elemento : fila) {
            System.out.println("* " + elemento);
        }

        // Percorrer Fila com While
        Iterator<String> iteratorFila = fila.iterator();
        while (iteratorFila.hasNext()) {
            System.out.println("# " + iteratorFila.next());
        }
    }
}
