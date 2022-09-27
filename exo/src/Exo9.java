import java.util.Scanner;

public class Exo9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
         int a  =scanner.nextInt();
         System.out.println("Enter the power");
         int b = scanner.nextInt();
         power(a,b);
    }

    static void power(int a,int b){
       int pow = (int) Math.pow(a,b);
       System.out.printf("%d power %d = %d",a,b,pow).println();
    }

}
