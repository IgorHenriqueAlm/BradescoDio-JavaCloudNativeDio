import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    /*
     * Desafio 17 - Filtrar os números primos da lista:
     * Com a ajuda da Stream API, filtre os números primos da lista e exiba o
     * resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .distinct() // Remove números duplicados
                .filter(Desafio17::ehPrimo)
                .toList(); // Coleta os números primos em uma nova lista

        System.out.println("Números primos: " + primos);
    }

    private static boolean ehPrimo(Integer n) {
        if (n <= 1) // Números menores ou iguais a 1 não são primos
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Verifica se o número é divisível por algum número entre
                                                  // 2 e a raiz quadrada de n
            if (n % i == 0) // Se for divisível, não é primo
                return false;
        }
        return true;
    }
}
