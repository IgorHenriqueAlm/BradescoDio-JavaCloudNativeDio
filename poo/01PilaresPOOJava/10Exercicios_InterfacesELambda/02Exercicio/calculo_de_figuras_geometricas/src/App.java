import java.util.Scanner;

public class App {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
            option = scanner.nextInt();
            if (option == 1) {
                geometricForm = createSquare();
            } else if (option == 2) {
                geometricForm = createRectangle();
            } else if (option == 3) {
                geometricForm = createCircle();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                System.out.println("Opção " +option+ " inválida.");
                System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                continue;
            }
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
            System.out.println("O resultado do calculo da área foi: " +geometricForm.getArea());
            System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        }
    }

    private static GeometricForm createSquare() {
    System.out.println("Informe os tamanho dos lados:");
    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
    var side = scanner.nextDouble();
    return new Square(side);
}

private static GeometricForm createRectangle() {
    System.out.println("Informe a base:");
    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
    var base = scanner.nextDouble();
    System.out.println("Informe a altura:");
    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
    var height = scanner.nextDouble();
    return new Rectangle(height, base);
}

private static GeometricForm createCircle() {
    System.out.println("Informe o raio:");
    System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }

}
