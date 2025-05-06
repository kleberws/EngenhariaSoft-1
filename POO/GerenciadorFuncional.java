package POO;
import java.util.*;
import java.util.stream.*;

public class GerenciadorFuncional {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void concluir(int indice) {
        tarefas = IntStream.range(0, tarefas.size())
            .mapToObj(i -> (i == indice) 
                ? new TarefaConcluida(tarefas.get(i)) 
                : tarefas.get(i))
            .collect(Collectors.toList());
    }

    public void remover(int indice) {
        tarefas = IntStream.range(0, tarefas.size())
            .filter(i -> i != indice)
            .mapToObj(tarefas::get)
            .collect(Collectors.toList());
    }

    public void listarTodas() {
        IntStream.range(0, tarefas.size())
            .forEach(i -> System.out.println(i + ": " + tarefas.get(i)));
    }

    public void listarPorStatus(boolean concluida) {
        IntStream.range(0, tarefas.size())
            .filter(i -> tarefas.get(i).isConcluida() == concluida)
            .forEach(i -> System.out.println(i + ": " + tarefas.get(i)));
    }

    class TarefaConcluida extends Tarefa {
        public TarefaConcluida(Tarefa original) {
            super(original.getDescricao());
            super.concluir();
        }
    }
}
