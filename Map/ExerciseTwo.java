package Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExerciseTwo {
    public static void main(String[] args) {

        // Crie um dicionário e relacione os estados e suas populações
        Map<String, Double> estados = new LinkedHashMap<>() {
            {
                put("PE", 9.616621d);
                put("AL", 3.351543d);
                put("CE", 9.187103d);
                put("RN", 3.534265d);
            }
        };
        System.out.println("\n-> Ordem de Inserção");
        for (Map.Entry<String, Double> estado : estados.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue());

        // Substitua a população do estados do RN por 3.534,165
        estados.put("RN", 3.534165d);

        // Confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039,277
        if (estados.get("PB") == null)
            estados.put("PB", 4.039277d);

        // Exiba a população de PB
        for (Map.Entry<String, Double> estado : estados.entrySet()) {
            if (estado.getKey().equals("PB"))
                System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        // Exiba os estados e suas populações em ordem alfabética
        System.out.println("\n-> Ordem Alfabética");
        Set<Map.Entry<String, Double>> estados2 = new TreeSet<>(new ComparatorNomeEstado());
        estados2.addAll(estados.entrySet());
        for (Map.Entry<String, Double> estado : estados2)
            System.out.println(estado.getKey() + " - " + estado.getValue());

        // Exiba o estado com a menor população e sua quantidade
        Map.Entry<String, Double> menorPopulacao = Collections.min(estados.entrySet(), Comparator.comparingDouble(Map.Entry::getValue));
        System.out.println("\nMenor População: " + menorPopulacao);

        // Exiba o estado com a maior população e sua quantidade
        Map.Entry<String, Double> maiorPopulacao = Collections.max(estados.entrySet(), new ComparatorPopulacaoEstado());
        System.out.println("\nMaior População: " + maiorPopulacao);

        // Exiba a soma da população desses estados
        Double soma = 0d;
        for (Map.Entry<String, Double> estado : estados.entrySet()) soma += estado.getValue();
        System.out.println("\nSoma das Populações: " + soma);

        // Exiba a média da população deste dicionário de estados
        Double media = soma / estados.size();
        System.out.println("\nMédia das Populações: " + media);

        // Remova os estados com a população menor que a média
        Iterator<Map.Entry<String, Double>> iterator = estados.entrySet().iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next().getValue();
            if (next < media) {
                iterator.remove();
                System.out.println("Removido: " + next);
            }
        }

        // Apague o dicionário de estados
        System.out.println("\nApagando Dicionários...");
        estados.clear();
        estados2.clear();

        // Confira se o dicionário está vazio
        System.out.println("\nEstá vazio? " + (estados.isEmpty() && estados2.isEmpty() ? "Sim" : "Não"));

    }
}

class ComparatorNomeEstado implements Comparator<Map.Entry<String, Double>> {

    @Override
    public int compare(Entry<String, Double> estado1, Entry<String, Double> estado2) {
        return estado1.getKey().compareTo(estado2.getKey());
    }

}

class ComparatorPopulacaoEstado implements Comparator<Map.Entry<String, Double>> {

    @Override
    public int compare(Entry<String, Double> estado1, Entry<String, Double> estado) {
        return estado1.getValue().compareTo(estado.getValue());
    }

}