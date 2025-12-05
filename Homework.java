import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Homework {

    protected String courseName;
    protected String description;
    protected Date dueDate;

    public Homework(String courseName, String description, Date dueDate) {
        this.courseName = courseName;
        this.description = description;
        this.dueDate = dueDate;
    }
    public String getFormatteDueDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dueDate);
    }
    public void printInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Details: " + description);
        System.out.println("Due Date: " + getFormatteDueDate());
    }

}
