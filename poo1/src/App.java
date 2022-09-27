import java.util.Arrays;
import java.util.Date;

public class App {

    public static void main(String[] args) throws Exception {

        Course course = new Course("JAVA",new Date());
       Student student = new Student("Ibrahim","Ahamada",42,course);
        student.setAge(-4);
        System.out.println( student.getCourse().toString());
        System.out.println( student.toString());
    }
}
