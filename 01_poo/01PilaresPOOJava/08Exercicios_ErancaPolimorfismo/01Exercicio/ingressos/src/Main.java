public class Main {
    public static void main(String[] args) {
        printIngresso(new Ingresso(30, "Superman", false));
        printIngresso(new MeiaEntrada(30, "Quarteto Fantástico", true));
        printIngresso(new IngressoFamilia(30, "Jurassic World ", false,4));
    }

    public static void printIngresso(Ingresso ingresso) {
        System.out.printf("======%s======%n", ingresso.getClass().getCanonicalName());
        System.out.println("Nome do filme: " + ingresso.getNomeDoFilme());
        System.out.println("Dublado: " + ingresso.isDublado());
        System.out.println("Legendado: " + ingresso.isLegendado());

        if(ingresso instanceof IngressoFamilia ingressoFamilia) 
            System.out.println("Quantidade de pessoas: " + ingressoFamilia.getQuantidadeDePessoas());

            System.out.printf("Valor: R$ %.2f%n", ingresso.getValor());
        System.out.println("===================\n");
    }
}
