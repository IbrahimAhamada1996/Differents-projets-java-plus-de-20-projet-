package Medium;

public class ShoppingCart {

    int totalNumberOfItems;
    double totalAmountOwed;

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public double getTotalAmountOwed() {
        return totalAmountOwed;
    }

    public void setTotalAmountOwed(double totalAmountOwed) {
        this.totalAmountOwed = totalAmountOwed;
    }

    public double getAveragePricePerItem(){
        return this.totalAmountOwed/this.totalNumberOfItems;
    }
    public void addItems(int numberOfItems, double pricePerItem){
        this.totalNumberOfItems += numberOfItems;
        this.totalAmountOwed += pricePerItem * numberOfItems ;
    }
    public void empty(){
        this.totalAmountOwed= 0.0;
        this.totalNumberOfItems = 0;

    }


}
