package Comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversa implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return Integer.compare(o2.getIdade(), o1.getIdade());
    }
}