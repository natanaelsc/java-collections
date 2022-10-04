package Map;

import java.util.Hashtable;
import java.util.Map;

public class ExempleHashTable {
    
    public static void main(String[] args) {
        
        Hashtable<String, Integer> alunos = new Hashtable<>();

        // Inserção
        alunos.put("Carlos", 21);
        alunos.put("Mariana", 33);
        alunos.put("Rafaela", 18);
        alunos.put("Pedro", 44);
        System.out.println(alunos);

        // Atualização
        alunos.put("Pedro", 55);

        // Remoção
        alunos.remove("Pedro");
        System.out.println(alunos);

        // Elemento no Indice 2
        int idadeAluno = alunos.get("Mariana");
        System.out.println(idadeAluno);
        
        // Tamanho
        System.out.println(alunos.size());

        // Navegação
        for (Map.Entry<String, Integer> entry : alunos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : alunos.keySet()) {
            System.out.println(key + " - " + alunos.get(key));
        }

        System.out.println(alunos);
    }
}
