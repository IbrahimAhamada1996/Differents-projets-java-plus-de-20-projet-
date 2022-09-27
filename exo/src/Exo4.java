public class Exo4 {

    public static void main(String[] args) {
        Exo4 exo4 = new Exo4();
        exo4.sum(5,8);
    }

    void sum(int a,int b){
       int sum  = a+b;
       System.out.printf("%d + %d = %d",a,b,sum);
    }
}
