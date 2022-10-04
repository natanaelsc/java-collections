package Map;

import java.util.TreeMap;

/**
 * Adicione os 26 estados brasileiros onde a sigla será a chave e o nome o valor
 * Remova o estado de Minas Gerais
 * Adicione o Ditrito Federal
 * Verifique o tamanho do Mapa
 * Remova o estado de Mato Grosso do Sul usando o nome.
 * Navegue em todos os registros do map, mostrando o seguinte no console: NOME (SIGLA)
 * Verifique se o estado de Santa Catarina existe no mapa buscando por sua sigla (SC)
 * Verifique se o estado de Maranhão existe no mapa buscando por seu nome
 */

public class ExerciseOne {
    
    public static void main(String[] args) {
        
        TreeMap<String, String> estados = new TreeMap<>();

        // Inserção dos 26 estados
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Para");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");
        System.out.println(estados);

        // Removendo Minas Gerais
        if (estados.containsKey("MG")) {
            System.out.println("Removendo " + estados.get("MG") + "...");
            estados.remove("MG");
        } else {
            System.out.println("Estado não encontrado!");
        }

        // Adicionando Distrito Federal
        if (estados.containsKey("DF")) {
            System.out.println(estados.get("DF") + " já está inserido.");
        } else {
            estados.put("DF", "Distrito Federal");
            System.out.println(estados.get("DF") + " inserido com Sucesso!");
        }

        // Verificando Tamanho do Mapa
        if (estados.containsKey("DF")) {
            int total = estados.size() - 1;
            System.out.println("Estados: " + total + " + " + estados.get("DF"));
        } else {
            System.out.println("Estadis: " + estados.size());
        }

        // Removendo Mato Grosso do Sul usando o nome
        if (estados.containsValue("Mato Grosso do Sul")) {
            System.out.println("Removendo " + estados.get("MS") + "...");
            estados.remove("MS", "Mato Grosso do Sul");
        }

        // Navegando
        for (String chave : estados.keySet()) {
            System.out.println(estados.get(chave) + " (" + chave + ")");
        }

        // Verificando Santa Catarina por sigla
        if (estados.containsKey("SC")) {
            System.out.println(estados.get("SC") + " existe.");
        }

        // Verificando Maranhão por nome
        if (estados.containsValue("Maranhão")) {
            System.out.println("Maranhão existe.");
        }
    }
}
