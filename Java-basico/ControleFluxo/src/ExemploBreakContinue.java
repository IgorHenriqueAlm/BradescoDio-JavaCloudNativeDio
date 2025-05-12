public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5 ; numero++) {
            if (numero == 4) {
                break; //para o código
            }
            System.out.println(numero);
        }

        for (int numero = -3; numero <= 5 ; numero++) {
            if (numero % 2 != 0 ) {
                continue; // continua o código mas não executa a funução do código
            }
            System.out.println(numero);
        }
    }
}
