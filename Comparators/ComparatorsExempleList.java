package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExempleList {

    public static void main(String[] args) {

        // Inserção de dados
        List<Estudante> estudantes = new ArrayList<>() {
            {
                add(new Estudante("Pedro", 19));
                add(new Estudante("Carlos", 23));
                add(new Estudante("Mariana", 21));
                add(new Estudante("João", 18));
                add(new Estudante("Adriana", 22));
                add(new Estudante("Thiago", 20));
                add(new Estudante("Carlos", 17));
                add(new Estudante("Larissa", 21));
            }
        };

        // Ordem de Inserção
        System.out.println("\n->\tOrdem de Inserção\t");
        System.out.println(estudantes);

        // Ordem Aleatória
        System.out.println("\n->\tOrdem Aleatória\t");
        Collections.shuffle(estudantes);
        System.out.println(estudantes);

        // Ordem Natural
        System.out.println("\n->\tOrdem Natural - Idade\t");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        // Ordem Reversa
        System.out.println("\n->\tOrdem Reversa - Idade\t");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        // Ordem Natural
        System.out.println("\n->\tOrdem Natural - Idade (method reference)\t");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        // Ordem Reversa
        System.out.println("\n->\tOrdem Reversa - Idade (method reference)\t");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        // Ordem Natural - Interface Comparable
        System.out.println("\n->\tOrdem Natural - Idade (interface comparable)\t");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        // Ordem Reversa - Interface Comparable
        System.out.println("\n->\tOrdem Reversa - Idade (interface comparable)\t");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversa());
        System.out.println(estudantes);

        // Ordem Natural - Interface Comparator
        System.out.println("\n->\tOrdem Natural - Nome (interface comparator)\t");
        Collections.sort(estudantes, new EstudanteComparatorNome());
        // estudantes.sort(new EstudanteComparatorNome());
        System.out.println(estudantes);

        // Embaralhar
        Collections.shuffle(estudantes);

        // Ordem Natural - Interface Comparator
        System.out.println("\n->\tOrdem Natural - Nome, Idade (Interface comparator)\t");
        Collections.sort(estudantes, new EstudanteComparatorNomeIdade());
        // estudantes.sort(new EstudanteComparatorNomeIdade());
        System.out.println(estudantes);
    }
}
