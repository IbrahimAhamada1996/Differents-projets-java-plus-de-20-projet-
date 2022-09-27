package multidimensionalArray;

public class ExoM7 {

    public static void main(String[] args) {
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j <=17-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i+i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
