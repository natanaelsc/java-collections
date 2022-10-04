package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
    
    public static void main(String[] args) {
        
        // Lista do tipo String com ArrayList
        List<String> nomes = new ArrayList<>();

        // Adicionando itens a lista
        nomes.add("Natan");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Juliana");
        nomes.add("João");
        System.out.println(nomes);

        // Ordenando itens
        Collections.sort(nomes);
        System.out.println(nomes);
        
        // Alterando por posição
        nomes.set(0, "Paulo");
        System.out.println(nomes);

        // Recebendo por posição
        System.out.println(nomes.get(1)); // Retorna o item na posição

        // Posição do objeto
        System.out.println("Elemento na posição " + nomes.indexOf("Natan")); // Retorna um Inteiro, caso não exista na lista é retornado um inteiro negativo

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size()); // Retorna tamanho da lista

        // Remove item na posição
        int last = nomes.size() - 1;
        nomes.remove(last); // Ultimo item da lista
        System.out.println(nomes);

        // Remove objeto
        nomes.remove("Paulo");
        System.out.println(nomes);

        // Verifica objeto na lista
        System.out.println(nomes.contains("Natan")); // Retorna true ou false

        // Percorrendo a lista com foreach
        for (String elemento : nomes) {
            System.out.println("* " + elemento);
        }

        // Percorrendo a lista atraves do objeto Iterator com while
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("# " + iterator.next());
        }

        // Limpa completamente a lista
        nomes.clear();

        // Verifica lista vázia
        if (nomes.isEmpty()) { // Retorna true ou false
            System.out.println("Lista Vázia!");
        } else {
            System.out.println(nomes);
        }
    }
}
