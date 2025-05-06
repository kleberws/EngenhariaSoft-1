import java.util.*;

public class Gerenciador {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listar() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + ": " + tarefas.get(i));
        }
    }

    public void marcarComoFeita(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoFeita();
        }
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }
}