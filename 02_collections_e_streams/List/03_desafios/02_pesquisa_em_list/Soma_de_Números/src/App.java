public class App {
    public static void main(String[] args) throws Exception {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adcionarNumero(10);
        somaNumeros.adcionarNumero(20);
        somaNumeros.adcionarNumero(-5);
        
        System.out.printf("Soma: %d%n", somaNumeros.calcularSoma());
        System.out.printf("Maior número: %d%n", somaNumeros.encontrarMaiorNumero());
        System.out.printf("Menor número: %d%n", somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
