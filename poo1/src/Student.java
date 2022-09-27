import Exception.AgeException;
public class Student {

    private String fastName;
    private String lastName;
    private int age;
    private Course course;

    public Student(String fastName, String lastName, int age,Course course) {
        this.fastName = fastName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fastName='" + fastName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public String getFastName() {
        return fastName;
    }

    public void setFastName(String fastName) {
        this.fastName = fastName;
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

    public void setAge(int age) throws Exception {
        if(age<0){
            throw new AgeException("The year can't be negatif");
        }

        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
