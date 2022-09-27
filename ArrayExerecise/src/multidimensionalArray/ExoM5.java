package multidimensionalArray;

public class ExoM5 {

    public static void main(String[] args) {
        int[] entiers =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < entiers.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+entiers[j]);
            }
            System.out.print("    ");
            for (int j = i; j >= 0; j--) {
                System.out.print(" ");
                System.out.print(entiers[j]);

            }

            System.out.println();


        }
    }
}
