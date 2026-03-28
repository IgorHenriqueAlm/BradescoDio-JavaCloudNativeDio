import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    /*
     * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
     * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e
     * exiba o resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesMultiplosTresECinco = numeros.stream()
                .distinct() // Remove os elementos duplicados
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)) // Filtra os números ímpares que são múltiplos de
                                                                       // 3 ou de 5
                .toList(); // Coleta os resultados em uma lista

        System.out.println("Números ímpares múltiplos de 3 ou de 5: " + imparesMultiplosTresECinco);
    }
}