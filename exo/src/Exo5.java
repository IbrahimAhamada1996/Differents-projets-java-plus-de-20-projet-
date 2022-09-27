import java.util.Scanner;

public class Exo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year");
        int annee = scanner.nextInt();
        whether(annee);

    }

    static void whether(int annee){
        if(annee % 4 ==0 && annee % 100 != 0){
           System.out.println(annee+" is whether");
        }else if(annee % 400 == 0){

            System.out.println(annee+" is whether");
        }else {

            System.out.println(annee+" isn't whether");
        }
    }
}
