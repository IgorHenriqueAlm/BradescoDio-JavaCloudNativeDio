import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio01 {
    /*
     * Desafio 1 - Mostre a lista na ordem numérica:
     * Crie um programa que utilize a Stream API para ordenar a lista de números em
     * ordem crescente e a exiba no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> ordemNumericaList = new ArrayList<>(numeros);

        ordemNumericaList = numeros.stream() // Cria uma stream a partir da lista de números
                .sorted() // Ordena os números em ordem crescente
                .toList(); // Coleta os resultados em uma nova lista

        System.out.printf("List numeros ------------%s \n", numeros);
        System.out.printf("List ordemNumericaList --%s", ordemNumericaList);
    }
}
