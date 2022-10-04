package Comparators;

import java.util.Comparator;

public class EstudanteComparatorNome implements Comparator<Estudante> {

    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e1.getNome().compareToIgnoreCase(e2.getNome());
    }

}
