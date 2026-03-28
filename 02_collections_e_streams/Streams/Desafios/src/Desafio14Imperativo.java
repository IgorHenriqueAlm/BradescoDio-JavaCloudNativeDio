import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio14Imperativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> unicos = new HashSet<>(numeros); // equivalente ao distinct()

        Integer maiorPrimo = null;

        for (int n : unicos) {
            if (ehPrimo(n)) { // equivalente ao filter
                if (maiorPrimo == null || n > maiorPrimo) { // equivalente ao max
                    maiorPrimo = n;
                }
            }
        }

        if (maiorPrimo != null) {
            System.out.println("Maior primo: " + maiorPrimo);
        }
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}