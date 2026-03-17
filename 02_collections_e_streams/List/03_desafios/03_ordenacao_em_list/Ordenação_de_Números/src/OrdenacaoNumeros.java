import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }
    
    public void ordenarAscendente() {
        validarList();
        Collections.sort(this.numerosList);
    }

    public void ordenarDescendente() {
        validarList();
        Collections.reverse(this.numerosList);
    }

    public void exibir() {
        System.out.println("Lista de Números: " + this.numerosList);
    }

    private void validarList() {
        if (numerosList.isEmpty()) throw new RuntimeException("A lista de números está vazia.");
    }
}