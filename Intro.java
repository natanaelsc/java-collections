import java.util.Scanner;

public class Intro {
    public static void main(String[] args) throws Exception {

        // Crie um Array de números inteiros:
        int[] numeros = { 2, 3, 5, 7, 11, 13, 18, 34 };

        // Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int elemento : numeros) {
            if (elemento % 2 == 0) System.out.print(elemento + " ");
        }
        
        // Lembre-se a sequência de valores é de 0 até T-1:
        Scanner leitor = new Scanner(System.in); 
        int t = leitor.nextInt();
        int[] n = new int[1000];
        
        // Implemente uma condição onde possamos preencher o vetor de N.
        int j = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = j;
            System.out.println("N[" + i + "] = " + n[i]);
            j++;
            if (j == t) j = 0;
        }
        leitor.close();
    }
}
