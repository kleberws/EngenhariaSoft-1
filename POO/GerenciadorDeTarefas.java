package POO;
import java.util.*;

public class GerenciadorDeTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void concluir(int indice) {
        if (indice >= 0 && indice < tarefas.size()) tarefas.get(indice).concluir();
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < tarefas.size()) tarefas.remove(indice);
    }

    public void listarTodas() {
        for (int i = 0; i < tarefas.size(); i++)
            System.out.println(i + ": " + tarefas.get(i));
    }

    public void listarPorStatus(boolean concluida) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            if (t.isConcluida() == concluida)
                System.out.println(i + ": " + t);
        }
    }
}