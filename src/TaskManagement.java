import java.util.List;
import java.util.ArrayList;
public class TaskManagement {
    private List<Task> tasks;

    //constructor
    public TaskManagement(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(Task task){
        if (tasks.contains(task)){
            tasks.remove(task);
        }else{
            System.out.println("Task does not exist");
        }
    }

    public void displayTasks(){
        for (int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);
            System.out.println("Task " + (i + 1) + ":");
            System.out.println("Title: " + task.getTitle());
            System.out.println("DueDate: " + task.getDueDate());
            System.out.println("Description: " + task.getDescription());
            System.out.println();

        }
    }

    public void updateTitle(Task task, String newTitle){
        if (tasks.contains(task)){
            task.setTitle(newTitle);
        }else{
            System.out.println("Task does not exist");
        }
    }
    public void updateDueDate(Task task, String newDueDate){
        if (tasks.contains(task)){
            task.setDueDate(newDueDate);
        }else{
            System.out.println("Task does not exist");
        }
    }
    public void updateDescription(Task task, String newDescription){
        if (tasks.contains(task)){
            task.setDescription(newDescription);
        }else{
            System.out.println("Task does not exist");
        }
    }


}
