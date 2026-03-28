import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio04 {
    /*
     * Desafio 4 - Remova todos os valores ímpares:
     * Utilize a Stream API para remover os valores ímpares da lista e imprima a
     * lista resultante no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        List<Integer> numIpares = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra apenas os números ímpares
                .toList(); // Coleta os resultados em uma nova lista

        System.out.println("List \"numImpares\": " + numIpares);

        numeros.removeAll(numIpares);
        System.out.println("Resultado após remover os números ímpares da List \"numeros\": \n" + numeros);
    }
}