/**
 * Crie uma lista de um objeto complexo e execute as seguintes operações:
 * # Adicione elementos nesta lista
 * # Ordene implementando a interface java.util.Comparator no seu objeto complexo
 * # Ordene implementando um novo objeto com a interface java.util.Comparable
 * # Ordene usando uma expressão lambda na chamada de suaLista.sort()
 * # Ordene usando referencias de metodos e os metodos estaticos de Comparator
 * # Ordene Coleções TreeSet e TreeMap
 */

/**
 * Exercicio 1 
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 */

package Comparators;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ExerciseOne {

    public static void main(String[] args) {

        List<Double> meses = new ArrayList<>() {
            {
                add(32d);
                add(27d);
                add(33d);
                add(29d);
                add(30d);
                add(28d);
            }
        };

        // calcule a média semestral das temperaturas
        Iterator<Double> iterator = meses.iterator();
        Double soma = 0d;
        while (iterator.hasNext())
            soma += iterator.next();
        Double media = soma / meses.size();

        // mostre todas as temperaturas acima desta média, e em que mês elas ocorreram
        iterator = meses.iterator();
        System.out.println("Temperatura acima da média:");
        int count = 1;
        Calendar cal = Calendar.getInstance();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            cal.set(Calendar.MONTH, count - 1);
            if (next > media) {
                String mes = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("pt", "BR"));
                System.out.println(count + " - " + mes + " - " + next);
            }
            count++;
        }

    }
}