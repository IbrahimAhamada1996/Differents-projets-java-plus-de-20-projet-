import java.util.HashSet;
import java.util.Set;

public class Person {
    private String firstname;
    private String lastname;
    private String job;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void introducing(){

        System.out.printf("Hello my name is %S %S,I'm a %S",this.firstname,this.lastname,this.job).println();
        //consiste à faire une reprensation basé dans la vie réel appele class ,ensuite pour pouvoir les communiquer
        // en creeé des objets
    }


}
