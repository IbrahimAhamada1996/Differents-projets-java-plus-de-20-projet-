//EXO4
public class Car {

   private String marque;
   private String model;
   private int speed;
   private boolean isStart=false;

    public void start(){
        this.isStart = true;
    }

    public void speedUp(int speed){
        this.speed += speed;
    }

    public void slowDown(int speed){
        this.speed -= speed;
    }

    public void stop(){
        this.speed=0;
    }

    public void turnOff(){
        this.isStart = false;
    }

}
