public class Main{
    public static void main(String[] args){
        TaskManagement taskManager = new TaskManagement();
        Task task1 = new Task("Groceries for the week", "8/10/24", "Fill the fridge back up");
        Task task2 = new Task("Finish project", "9/7/24", "Finish the task management project");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        System.out.println("All tasks: ");
        taskManager.updateTitle(task1, "Weekly grocieries");
        taskManager.updateDueDate(task1, "8/15/24");

        taskManager.deleteTask(task2);
        System.out.println("Tasks after deletion");
        taskManager.displayTasks();
        System.out.println();


    }

}