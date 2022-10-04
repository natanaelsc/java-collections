/**
 * Exercicio 2
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vitima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 * Caso contrário ela será classificada como inocente.
 */

package Comparators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>() {
            {
                add("Telefonou para a vítima? [S/N]");
                add("Esteve no local do crime? [S/N]");
                add("Mora perto da vitima? [S/N]");
                add("Devia para a vítima? [S/N]");
                add("Já trabalhou com a vítima? [S/N]");
            }
        };

        Iterator<String> iterator = perguntas.iterator();
        Scanner entrada = new Scanner(System.in);
        int contagem = 0;
        while (iterator.hasNext()) {
            String pergunta = iterator.next();
            System.out.println(pergunta);
            String resposta = entrada.nextLine();
            resposta.toUpperCase();
            if (resposta.equals("S")) contagem++;
        }
        entrada.close();

        if (contagem == 2) System.out.println("Suspeita");
        else if (contagem >= 3 && contagem <= 4) System.out.println("Cúmplice");
        else if (contagem == 5) System.out.println("Assassino");
        else System.out.println("Inocente");

    }
}
