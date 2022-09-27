package Easier;

public class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName(){
        return  this.lastName+", " + this.firstName;
    }
    public boolean isAdult(){
        //if (this.age>=18)
        //    return true;

       // return  false;
        return age>=18;
    }

}
