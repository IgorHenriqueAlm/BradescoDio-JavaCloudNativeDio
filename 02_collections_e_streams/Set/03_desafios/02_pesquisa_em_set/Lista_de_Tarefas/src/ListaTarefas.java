import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        conjuntoTarefas.remove(this.encontrarTarefa(descricao));
    }

    public void exibirTarefas() {
        validar();
        System.out.println(conjuntoTarefas);
    }

    public int contarTarefas() {
        validar();
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        validar();
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        validar();
        Set<Tarefa> tarefasPendentes = new HashSet<>(conjuntoTarefas);
        tarefasPendentes.removeAll(this.obterTarefasConcluidas());
        if (tarefasPendentes.size() == 0) 
            System.out.println("A lista de tarefas não tem tarefas pendentes.");
            
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluir = encontrarTarefa(descricao);
        tarefaConcluir.setConcluido(true);
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = encontrarTarefa(descricao);
        tarefaPendente.setConcluido(false);
    }

    public void limparListaTarefas() {
        System.out.println("Linpando a lista de tarefas");
        conjuntoTarefas.clear();
    }
    
    private Tarefa encontrarTarefa(String descricao) {
        validar();
        Tarefa tarefa = null;
        
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa = t;
                break;
            }
        }
        if (tarefa == null)
            throw new RuntimeException("A lista não contém essa tarefa");
        
        return tarefa;
    }

    private void validar() {
        if (conjuntoTarefas.isEmpty()) 
            throw new RuntimeException("A lista de tarefas está vazia.");
        
    }
}