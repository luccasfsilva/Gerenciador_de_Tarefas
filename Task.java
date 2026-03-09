public class Task {

    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        this.completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "[✓]" : "[ ]";
        return status + " " + description;
    }
}
