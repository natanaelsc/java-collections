package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExempleHashMap {

    public static void main(String[] args) {

        Map<String, Integer> copas = new HashMap<>();

        // Inserção
        copas.put("Brasil", 5);
        copas.put("Alemanha", 4);
        copas.put("Itália", 4);
        copas.put("Uruguai", 2);
        copas.put("Argentina", 2);
        copas.put("França", 2);
        copas.put("Inglaterra", 1);
        copas.put("Espanha", 1);
        System.out.println(copas.toString());

        // Atualização de chave
        // copas.put("Brasil", 6);

        // Retorna elemento
        System.out.println("Chave: " + copas.get("Argentina"));

        // Verifica existencia de elemento por chave
        System.out.println("Contem a chave: " + (copas.containsKey("França") ? "Sim" : "Não"));

        // Verifica existencia de elemento por valor
        System.out.println("Contem o elemento: " + (copas.containsValue(6) ? "Sim" : "Não"));

        // Retorna chaves
        Set<String> paises = copas.keySet();
        System.out.println("Paises: " + paises);

        // Retona elementos
        Collection<Integer> quantidades = copas.values();
        System.out.println("Titulos: " + quantidades);

        // Remove elemento por chave
        System.out.println("Remove elemento " + copas.remove("França"));

        // Tamanho do Mapa
        System.out.println("Tamanho do mapa: " + copas.size() + " elementos.");

        // Maior Campeão
        Integer maisTitulos = Collections.max(copas.values());
        Set<Map.Entry<String, Integer>> entries = copas.entrySet();
        String maiorCampeao;
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maisTitulos)) {
                maiorCampeao = entry.getKey();
                System.out.println("Maior(es) campeao: " + maiorCampeao + " com " + maisTitulos + " titulo(s)");
            }
        }

        // Menor Campeão
        Integer menosTitulos = Collections.min(copas.values());
        for (Map.Entry<String, Integer> entry : copas.entrySet()) {
            if (entry.getValue().equals(menosTitulos))
                System.out.println("Menor(es) campeão: " + entry.getKey() + " com " + menosTitulos + " titulo(s)");
        }

        // Soma de titulos
        Iterator<Integer> iterator = copas.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) soma += iterator.next();
        System.out.println("Soma de titulos: " + soma);

        // Media de titulos
        System.out.println("Media de titulos: " + (soma / quantidades.size()));

        // Remove paises com menos de 2 titulos
        Iterator<Integer> iterator2 = copas.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 2) iterator2.remove();
        }
        System.out.println(paises);

        // Ordem de Inserção
        System.out.println("Ordem de inserção: ");
        Map<String, Integer> copas2 = new LinkedHashMap<>(copas);
        System.out.println(copas2);

        // Ordem Natural
        System.out.println("Ordem natural: ");
        Map<String, Integer> copas3 = new TreeMap<>(copas);
        System.out.println(copas3);

        // Navegação
        for (Map.Entry<String, Integer> entry : copas.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : copas.keySet()) {
            System.out.println(key + " - " + copas.get(key));
        }

        // Limpa coleção
        copas.clear();
        System.out.println("Coleção vazia: " + (copas.isEmpty() ? "Sim" : "Não"));
    }
}
