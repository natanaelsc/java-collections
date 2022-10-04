package Comparators;

import java.util.Comparator;

public class EstudanteComparatorNomeIdade implements Comparator<Estudante>{

    @Override
    public int compare(Estudante e1, Estudante e2) {
        int nome = e1.getNome().compareToIgnoreCase(e2.getNome());
        if (nome != 0) return nome;
        return Integer.compare(e1.getIdade(), e2.getIdade());
    }

}
