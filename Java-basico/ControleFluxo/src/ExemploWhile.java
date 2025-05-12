import java.util.concurrent.ThreadLocalRandom;;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoDoce = valorAleatorio();
            if (valorDoDoce > mesada) {
                valorDoDoce = mesada;
            }

            System.out.println("Valor do doce " + valorDoDoce + "adiciionado no carrinho");
            mesada -= valorDoDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada com doce");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,13);
    }
}
