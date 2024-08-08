public class Task {
    private String title;
    private String dueDate;
    private String description;


    //constructor
    public Task (String title, String dueDate, String description){
        this.title = title;
        this.dueDate = dueDate;
        this.description = description;
    }
//getters and setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }






}

