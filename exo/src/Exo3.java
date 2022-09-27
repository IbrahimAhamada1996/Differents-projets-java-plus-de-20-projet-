public class Exo3 {

    public static void main(String[] args) {
        Exo3 exo3 = new Exo3();
            exo3.Swap2Integers();
    }

    void Swap2Integers(){
        int a = 5;
        int b = 9;
        int c;
        //Swap two integer
        c=a;
        a=b;
        b=c;

        System.out.printf("a = %d et b= %d ",a,b).println();
    }
}
