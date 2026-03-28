import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio05 {
    /*
     * Desafio 5 - Calcule a média dos números maiores que 5:
     * Com a Stream API, calcule a média dos números maiores que 5 e exiba o
     * resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5) // Filtra apenas os números maiores que 5
                .mapToInt(Integer::intValue) // Converte a stream de Integer para IntStream
                .average(); // Calcula a média dos números filtrados

        if (media.isPresent()) // Verifica se a média foi calculada (ou seja, se havia números maiores que 5)
            System.out.println("Média: " + media.getAsDouble());
        else
            System.out.println("Nenhum número maior que 5.");
    }
}