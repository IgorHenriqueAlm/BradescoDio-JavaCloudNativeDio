import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        validar();
        if (dicionario.containsKey(palavra)) dicionario.remove(palavra);

        else System.out.println("A palavra '" + palavra + "' não foi encontrada no dicionário.");
    }
    
    public void exibirPalavras() {
        validar();
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        validar();
        if (dicionario.containsKey(palavra)) return dicionario.get(palavra);

        else return String.format("A palavra '%s' não foi encontrada no dicionário.", palavra);
    }

    private void validar() {
        if (dicionario.isEmpty()) {
            throw new NullPointerException("O dicionário está vazio.");
        }
    }
}
