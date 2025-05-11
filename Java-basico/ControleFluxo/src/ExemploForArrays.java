public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }

        /* REPETIÇÃO REFATORADA POR FOR EACH ACIMMA
         for(int indice = 0; indice <= alunos.length ; indice++){
             System.out.println("O aluno no indice " + indice + "é o " + alunos[indice]);
         }
         */
    }
}
