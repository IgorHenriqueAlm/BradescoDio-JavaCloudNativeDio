import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    /*
     * Desafio 14 - Encontre o maior número primo da lista:
     * Com a Stream API, encontre o maior número primo da lista e exiba o resultado
     * no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .distinct() // Remove números duplicados
                .filter(Desafio14::ehPrimo) // Filtra apenas os números primos
                .max(Integer::compareTo); // Encontra o maior número primo

        maiorPrimo.ifPresent(n -> System.out.println("Maior primo: " + n));
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) // Números menores ou iguais a 1 não são primos
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) { // Verifica se n é divisível por algum número entre 2 e a raiz
                                                  // quadrada de n
            if (n % i == 0) // Se for divisível por algum número, não é primo
                return false;
        }
        return true;
    }
}
