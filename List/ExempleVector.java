package List;

import java.util.List;
import java.util.Vector;

public class ExempleVector {
    
    public static void main(String[] args) {
        
        // Vetor do tipo String com Vector
        List<String> esportes = new Vector<>();
        
        // Adicionando itens ao vetor
        esportes.add("Futebol");
        esportes.add("Tênis");
        esportes.add("Basquetebol");
        esportes.add("Handebol");
        System.out.println(esportes);

        // Altera valor na posição
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        // Remove valor na posição
        esportes.remove(2);
        System.out.println(esportes);

        // Remove elemento
        esportes.remove("Handebol");
        System.out.println(esportes);

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Percorre vetor
        for (String elements : esportes) {
            System.out.println("* " + elements);
        }
    }
}
