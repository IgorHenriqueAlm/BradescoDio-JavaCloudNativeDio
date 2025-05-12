package tratamento_de_excecoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
     public static void main(String[] args) {

        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scan.nextDouble(); 

        System.out.println("Olá,me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        scan.close(); // Fecha o scanner corretamente
        }
        catch(InputMismatchException e){
            System.out.println("Os campos Idade e Altura precisão ser numéricos");
        }
    }
}
