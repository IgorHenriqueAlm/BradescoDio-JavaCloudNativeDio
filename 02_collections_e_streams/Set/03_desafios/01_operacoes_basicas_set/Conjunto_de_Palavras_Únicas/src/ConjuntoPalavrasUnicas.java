import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;
    
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);        
    }

    public void removerPalavra(String palavra) {
        validar();
        if(this.palavrasUnicas.contains(palavra))
            this.palavrasUnicas.remove(palavra);
        else
            System.out.println("A palavra '" + palavra + "' não existe no conjunto de palavras únicas.");
    }

    public boolean verificarPalavra(String palavra){
        validar();
        return this.palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        validar();
        System.out.println(this.palavrasUnicas);
    }

    private void validar() {
        if (palavrasUnicas.isEmpty()) {
            throw new NullPointerException("O conjunto de palavras únicas está vazio.");
        }
    }
}
