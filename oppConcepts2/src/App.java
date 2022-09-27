import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //Exo1
        Employee employee = new Employee("Robert",1994,"64C-WallsStreat");
        Employee employee2 = new Employee("Sam",2000,"68D-WallsStreat");
        Employee employee3 = new Employee("John",1999,"26B-WallsStreat");

        List<Employee> employeeList = Arrays.asList(employee,employee2,employee3);
        System.out.println("Name   Year of joining   Address ");
        System.out.println(".......................................");
        for (Employee e:employeeList
             ) {
            System.out.println(e.getName()+"       "+e.getYearOfJoining()+"        "+e.getAddress());
        }
    }
}
