import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar tarefa como feita");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    gerenciador.adicionar(desc);
                    break;
                case 2:
                    gerenciador.listar();
                    break;
                case 3:
                    System.out.print("Número da tarefa: ");
                    int feita = scanner.nextInt();
                    gerenciador.marcarComoFeita(feita);
                    break;
                case 4:
                    System.out.print("Número da tarefa: ");
                    int remover = scanner.nextInt();
                    gerenciador.remover(remover);
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}