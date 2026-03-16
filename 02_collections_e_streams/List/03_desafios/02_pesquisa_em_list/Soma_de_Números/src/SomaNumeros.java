import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adcionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        validarList();
        int soma = 0;
        for (int numero : numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        validarList();
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : numeroList) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        validarList();
        int menorNumero = Integer.MAX_VALUE;
        for (int numero : numeroList) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        validarList();
        System.out.println(numeroList);
    }

    private void validarList() {
        if (numeroList.isEmpty()) throw new RuntimeException("A lista de números está vazia.");
    }

    @Override
    public String toString() {
        return "SomaNumeros [numeroList=" + numeroList + "]";
    }
}
