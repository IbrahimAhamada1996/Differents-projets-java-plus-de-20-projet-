public class Exo12 {

    public static void main(String[] args) {
        sumOrDouble(4,44);
    }

    static void sumOrDouble(int a,int b){
        if (a==b)
            System.out.printf("The double ( %d ) of the sum  is %d",a,b,(a*2)).println();

        if (a!=b)
            System.out.printf("The sum of two numbers ( %d and %d ) is %d",a,b,(a+b)).println();
    }
}
