//EXO1
public class Area {

    private double lenght;
    private double breadht;

   public void  setDim(double lenght,double breadht){
       this.lenght = lenght;
       this.breadht = breadht;
   }

  public double getArea(){
       return this.lenght * this.breadht;
  }

}
