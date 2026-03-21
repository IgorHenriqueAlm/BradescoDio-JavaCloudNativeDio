import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.contagemMap.put(palavra, contagem);    
    }

    public void removerPalavra(String palavra) {
        validar();
        if (contagemMap.containsKey(palavra)) contagemMap.remove(palavra);

        else throw new IllegalArgumentException("A palavra '" + palavra + "' não existe no Map.");
    }

    public int exibirContagemPalavras() {
        validar();
        int contagemTotal = 0;
        for (int contagem : contagemMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        validar();
        String palavraMaisFrequente = null;
        int contagemMaxima = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > contagemMaxima) {
                contagemMaxima = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    private void validar() {
        if (contagemMap.isEmpty()) {
            throw new NullPointerException("O Map está vazio.");
        }
    }
}
