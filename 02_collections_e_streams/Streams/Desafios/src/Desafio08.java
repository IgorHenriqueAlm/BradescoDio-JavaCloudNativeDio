import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    /*
     * Desafio 8 - Somar os dígitos de todos os números da lista:
     * Utilizando a Stream API, realize a soma dos dígitos de todos os números da
     * lista e exiba o resultado no console.
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .flatMapToInt(n -> String.valueOf(n).chars()) // Converte cada número em uma stream de caracteres
                .map(Character::getNumericValue) // Converte os caracteres de volta para seus valores numéricos
                .sum(); // Soma todos os dígitos

        System.out.println("Soma dos dígitos: " + somaDosDigitos);
    }
}