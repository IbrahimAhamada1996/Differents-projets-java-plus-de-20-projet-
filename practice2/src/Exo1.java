public class Exo1 {

    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();
       String  str = "The quick brown fox";
        exo1.ReverseString(str);
    }

    public void ReverseString(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder= stringBuilder.reverse();
        System.out.println("Reverse string: = " + stringBuilder);
    }

}
