import java.util.Date;
import java.util.Calendar;
public class TestHomework {
    public static void main(String[] args) {
        Date now = new Date();
        Homework hw = new Homework("seng211" , "Prepare a slide about array vs arraylist and date class", now);
        hw.printInfo();

Calendar cal = Calendar.getInstance();
cal.set(2025 ,  Calendar.December , 10 , 23 ,59);

Date deadline = cal.getTime();
    Homework Hw1= new Homework(
            "ceng201-alg",
            "bst",
            deadline
    );
    Hw1.printInfo();
    }
}
