//EXO3
public class Employe {

    private double salary;
    private int numberOfHoursOfWork;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfHoursOfWork() {
        return numberOfHoursOfWork;
    }

    public void setNumberOfHoursOfWork(int numberOfHoursOfWork) {
        this.numberOfHoursOfWork = numberOfHoursOfWork;
    }

    public String getInfo(double salary, int numberOfHoursOfWork){
        return "Salary: "+salary+
                "\nnumber Of Hours OfWork "+numberOfHoursOfWork;
    }

    public void AddSal(){
        if (this.salary<500)
            this.salary+=10;
    }

    public void addWork(){
        if (this.numberOfHoursOfWork>6)
            this.salary+=5;
    }

}
