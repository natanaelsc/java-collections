package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExempleTreeMap {
    
    public static void main(String[] args) {
        
        TreeMap<String, String> capitais = new TreeMap<>();

        // Inserção Arvore
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");
        System.out.println(capitais);

        // Retorna Primeiro Elemento no Topo da Arvore
        System.out.println(capitais.firstKey());

        // Retorna Ultimo Elemento no Final da Arvore
        System.out.println(capitais.lastKey());

        // Retorna Primeiro Elemento Abaixo do Elemento
        System.out.println(capitais.lowerKey("SC"));

        // Retorna Primeiro Elemento Acima do Elemento
        System.out.println(capitais.higherKey("SC"));

        // Retorna Primeiro Elemento no Topo da Arvore
        System.out.println(capitais.firstEntry().getKey() + " - " + capitais.firstEntry().getValue());

        // Retorna Ultimo Elemento no Final da Arvore
        System.out.println(capitais.lastEntry().getKey() + " - " + capitais.lastEntry().getValue());

        // Retorna Primeiro Elemento Abaixo do Elemento
        System.out.println(capitais.lowerEntry("SC").getKey() + " - " + capitais.lowerEntry("SC").getValue());

        // Retorna Primeiro Elemento Acima do Elemento
        System.out.println(capitais.higherEntry("SC").getKey() + " - " + capitais.higherEntry("SC").getValue());

        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();

        // Retorna Primeiro Elemento no Topo da Arvore, Removendo do Map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        // Retorna Primeiro Elemento no Final da Arvore, Removendo do Map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(capitais);

        // Navegação
        Iterator<String> iterator = capitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + capitais.get(key));
        }

        for (String cap : capitais.keySet()) {
            System.out.println(cap + " - " + capitais.get(cap));
        }

        for (Map.Entry<String, String> cap : capitais.entrySet()) {
            System.out.println(cap.getKey() + " - " + cap.getValue());
        }
    }
}
