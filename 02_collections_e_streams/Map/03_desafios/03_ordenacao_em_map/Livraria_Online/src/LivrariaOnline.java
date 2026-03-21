import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor,  double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        validar();
        String livroParaRemover = null;
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                livroParaRemover = entry.getKey();
                break;
            }
        }
        if (livroParaRemover != null) livros.remove(livroParaRemover);

        else throw new IllegalArgumentException("Livro não encontrado");
    }

    public void exibirLivrosOrdenadosPorPreco() {
        validar();
        List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livros.entrySet());
        
        Collections.sort(livrosOrdenados, new ComparatorPorPreco());
        
        System.out.println(livrosOrdenados);
    }

    public void exibirLivrosOrdenadosPorAutor() {
        validar();
        List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosOrdenados, new ComparatorPorAutor());

        System.out.println(livrosOrdenados);
    }
    
    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        validar();
        List<Livro> livrosPorAutor = new ArrayList<>();

        for (Map.Entry<String,Livro> entry : livros.entrySet()) {
            if (entry.getValue().getAutor().equals(autor))
                livrosPorAutor.add(entry.getValue());
        }

        if (livrosPorAutor.size() == 0) 
            throw new IllegalArgumentException("Nenhum livro encontrado para o autor: " + autor);
        
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        validar();
        List<Livro> livroMaisCaro = new ArrayList<>();
        Double maiorPreco = Double.MIN_VALUE;

        for (Livro l : livros.values()) {
            if (l.getPreco() > maiorPreco) {
                maiorPreco = l.getPreco();
                livroMaisCaro.clear();
                livroMaisCaro.add(l);
            } else if (l.getPreco() == maiorPreco) {
                livroMaisCaro.add(l);
            }
        }
            
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        validar();
        List<Livro> livroMaisBarato = new ArrayList<>();
        Double menorPreco = Double.MAX_VALUE;

        for (Livro l : livros.values()) {
            if (l.getPreco() < menorPreco) {
                menorPreco = l.getPreco();
                livroMaisBarato.clear();
                livroMaisBarato.add(l);
            } else if (l.getPreco() == menorPreco) {
                livroMaisBarato.add(l);
            }
        }
            
        return livroMaisBarato;
    }

    private void validar() {
        if (livros.isEmpty()) {
            throw new NullPointerException("O Map está vazio.");
        }
    }

    @Override
    public String toString() {
        return "LivrariaOnline [" + livros + "]";
    }

    
}
