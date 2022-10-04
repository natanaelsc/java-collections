package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExempleStreamApi {
    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("4", "0", "6", "2", "5", "6", "3", "7", "9", "1");
        System.out.println("Imprima todos os elementos: ");

        // Classe Anonima
        System.out.println("\nClasse Anonima: ");
        numeros.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            };
        });

        // Expressão Lambda
        System.out.println("\nExpressão Lambda: ");
        numeros.stream().forEach(s -> System.out.print(s));

        // Expressão Lambda sem Stream
        System.out.println("\nExpressão Lambda sem Stream: ");
        numeros.forEach(s -> System.out.print(s));

        // Method Reference
        System.out.println("\nMethod Reference: ");
        numeros.forEach(System.out::print);

        // Pegue os 5 primeiros numeros e coloque dentro de um Set
        System.out.println("\nImprima os 5 primeiros numeros: ");
        numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::print);
        // Set<String> numerosSet = numeros.stream().limit(5).collect(Collectors.toSet());

        // Transforme esta lista de String em uma lista de numeros inteiros
        System.out.println("\nNumeros inteiros: ");
        numeros.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()).forEach(System.out::print);
        // List<Integer> numerosToInteger = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());

        // Pega os numeros pares e maiores que 5 e coloque em uma lista (CLasse Anonima)
        List<Integer> paresMaioresQue5 = numeros.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i %2 == 0 && i > 5) return true;
                        return false;
                    }
        }).collect(Collectors.toList());
        System.out.println("\nPares maiores que 5: " + paresMaioresQue5);


        // Pega os numeros pares e maiores que 2 e coloque em uma lista (Expressão Lambda)
        List<Integer> paresMaioresQue2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(n -> (n % 2 == 0 && n > 2))
                .collect(Collectors.toList());
        System.out.println("\nPares maiores que 2: " + paresMaioresQue2);

        // Mostre a media dos números
        System.out.print("\nMostre a media dos números: ");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        
        // Remova os valores impares (Classe Anonima)
        List<Integer> numerosIntegers = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosIntegers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosIntegers);

        // Remova os valores impares (Expressão Lambda)
        List<Integer> numerosIntegers2 = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosIntegers.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosIntegers2);
    }
}
