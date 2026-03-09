import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        int option;

        do {

            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("Número da tarefa: ");
                    int complete = scanner.nextInt() - 1;
                    manager.completeTask(complete);
                    break;

                case 4:
                    System.out.print("Número da tarefa: ");
                    int remove = scanner.nextInt() - 1;
                    manager.removeTask(remove);
                    break;

            }

        } while (option != 0);

        scanner.close();
    }
}
