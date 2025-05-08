package edu.igor.sintaxe_basica_com_java.aprendendo_a_sintaxe_java._001_anatomia_das_classes_5;
public class App {
    public static void main(String[] args) throws Exception {
        String priNome = "Igor";
        String segNome = "Henrique";
        String complNome = nomeCompleto(priNome, segNome);
        System.out.println(complNome);
    }
    
    public static String nomeCompleto (String primNome , String segNome){
        return primNome.concat(" ").concat(segNome);
    }
}