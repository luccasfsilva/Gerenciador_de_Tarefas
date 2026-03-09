import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void listTasks() {

        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + " - " + tasks.get(i));
        }
    }

    public void completeTask(int index) {

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).completeTask();
        } else {
            System.out.println("Tarefa inválida.");
        }
    }

    public void removeTask(int index) {

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Tarefa inválida.");
        }
    }
}
