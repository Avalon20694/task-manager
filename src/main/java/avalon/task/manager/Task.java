package avalon.task.manager;

public class Task 
{
    private static final int TITLE_MAX_LENGTH = 60;
    
    private int ID;
    private String title;
    private Priority priority;
    private boolean isCompleted;
    
    public Task(int ID, String title, Priority priority, boolean isCompleted)
    {
        validateData(ID, title, priority);
        
        this.ID = ID;
        this.title = title;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }
    
    // Validations
    
    private void validateID(int ID)
    {
        if(ID < 1)
        {
            throw new IllegalArgumentException("ID cannot be 0 or negative.");
        }
    }
    
    private void validateTitle(String title)
    {
        if(title == null || title.isBlank() || title.isEmpty() || title.length() > TITLE_MAX_LENGTH)
        {
            throw new IllegalArgumentException("Title cannot be null, blank, empty or beyond the max length.");
        }
    }
    
    private void validatePriority(Priority priority)
    {
        if(priority == null)
        {
            throw new IllegalArgumentException("Priority cannot be null.");
        }
    }
    
    private void validateData(int ID, String title, Priority priority)
    {
        validateID(ID);
        validateTitle(title);
        validatePriority(priority);
    }
}
