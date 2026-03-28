import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    /*
     * Desafio 7 - Encontrar o segundo número maior da lista:
     * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
     * resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaiorNum = numeros.stream()
                .distinct() // Remove números duplicados para garantir que o segundo maior seja único
                .sorted(Comparator.reverseOrder()) // Ordena os números em ordem decrescente
                .skip(1) // Pula o primeiro número (o maior) para obter o segundo maior
                .findFirst() // Obtém o segundo maior número
                .orElse(0); // Retorna 0 se a lista estiver vazia ou não houver um segundo maior número

        System.out.println("Segundo maior número: " + segundoMaiorNum);

    }
}
