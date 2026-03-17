public class App {
    public static void main(String[] args) throws Exception {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);

        System.out.println("Números antes da ordenação:");
        ordenacaoNumeros.exibir();

        System.out.println("Números em ordem crescente:");
        ordenacaoNumeros.ordenarAscendente();
        ordenacaoNumeros.exibir();

        System.out.println("Números em ordem decrescente:");
        ordenacaoNumeros.ordenarDescendente();
        ordenacaoNumeros.exibir();
    }   
}
