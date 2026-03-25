import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        validar();
        Aluno alunoParaRemover = null;

        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                alunoParaRemover = a;
                alunos.remove(alunoParaRemover);
                break;
            }
        }
        if (alunoParaRemover == null)
            throw new RuntimeException("A lista não contém esse aluno.");
    }

    public void exibirAlunosPorNome() {
        validar();
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        validar();
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        validar();
        System.out.println(alunos);
    }

    private void validar() {
        if (alunos.isEmpty()) 
            throw new RuntimeException("A lista de alunos está vazia.");
        
    }
}
