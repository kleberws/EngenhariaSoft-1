public class Tarefa {
    private String descricao;
    private boolean feita;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.feita = false;
    }

    public void marcarComoFeita() {
        this.feita = true;
    }

    public boolean estaFeita() {
        return feita;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return (feita ? "[X] " : "[ ] ") + descricao;
    }
}