public class Exo11 {

    public static void main(String[] args) {

        System.out.println(power(64));
    }
    static boolean power(int n){
        double a=  Math.cbrt(n);

               a= Math.sqrt(a);
        System.out.println(a);
        System.out.println((int)Math.pow((int)a,4));

        if ((int)Math.pow(a,4) == n){
            return true;
        }else {
            return false;
        }


    }
}
