package Easier;

public class Company {

    String name;
    int numberOfEmployee;
    double revenue;
    double expeneses;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int nimberOfEmployee) {
        this.numberOfEmployee = nimberOfEmployee;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpeneses() {
        return expeneses;
    }

    public void setExpeneses(double expeneses) {
        this.expeneses = expeneses;
    }

    public String getCompanySize(){
        if (this.numberOfEmployee <=50)
            return "small";
        else if (this.numberOfEmployee>=51 && this.numberOfEmployee<=250)
            return "medium";
        else if (this.numberOfEmployee>250)
            return "large";

        return null;
    }

    public double getProfit(){

        return this.revenue-this.expeneses;
    }
}
