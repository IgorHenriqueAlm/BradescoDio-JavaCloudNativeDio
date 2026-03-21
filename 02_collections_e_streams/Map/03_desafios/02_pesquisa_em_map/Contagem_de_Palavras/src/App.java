public class App {
    public static void main(String[] args) throws Exception {
        ContagemPalavras ContagemPalavras = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        ContagemPalavras.adicionarPalavra("Java", 2);
        ContagemPalavras.adicionarPalavra("Python", 8);
        ContagemPalavras.adicionarPalavra("JavaScript", 1);
        ContagemPalavras.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + ContagemPalavras.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = ContagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
