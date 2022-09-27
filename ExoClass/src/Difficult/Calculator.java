package Difficult;

public class Calculator {

    int currentValue;

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int add(int addend){

        return this.currentValue += addend;
    }
    public int multiply(int multiplier){
        return this.currentValue*=multiplier;
    }
    public int substract(int subtrahend){
        return this.currentValue-=subtrahend;
    }
    public int power(int exponent){
        return (int) pow(this.currentValue,exponent);
    }
    public void reset(){
        this.currentValue = 0;
    }

    public double pow(double n,double e){
        double p=1;
        for (int i = 1; i <=e ; i++) {

            p *=  n;
        }
        return p;
    }
}
