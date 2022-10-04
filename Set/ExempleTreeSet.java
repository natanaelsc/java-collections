package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExempleTreeSet {

    public static void main(String[] args) {

        TreeSet<String> capitais = new TreeSet<>();

        // Adiciona
        capitais.add("Porto Alegre");
        capitais.add("Rio de Janeiro");
        capitais.add("Curitiba");
        capitais.add("Aracaju");
        capitais.add("Recife");
        capitais.add("Belo Horizonte");
        System.out.println(capitais);

        // Retorna Primeiro Elemento
        System.out.println(capitais.first());

        // Retorna Ultimo Elemento
        System.out.println(capitais.last());

        // Retorna Primeiro Elemento Abaixo da Arvore
        System.out.println(capitais.lower("Aracaju"));

        // Retorna Ultimo Elemento Acima da Arvore
        System.out.println(capitais.higher("Aracaju"));

        // Retorna Arvore
        System.out.println(capitais);

        // Retorna e Remove Primeiro Elemento no Topo da Arvore
        System.out.println(capitais.pollFirst());

        // Retorna e Remove Primeiro Elemento do Final da Arvore
        System.out.println(capitais.pollLast());

        // Retorna Arvore
        System.out.println(capitais);

        // Navagação
        Iterator<String> iterator = capitais.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String cap : capitais) {
            System.out.println(cap);
        }
    }
}
