package multidimensionalArray;

public class ExoM4 {


    public static void main(String[] args) {
        int[] entiers =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] entiers2 =  new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int k = 0; k < entiers2.length; k++) {
            for (int j = k+1; j <entiers2.length ; j++) {
                if (entiers2[k]<entiers2[j]){
                    int temp=entiers2[k];
                    entiers2[k]=entiers2[j];
                    entiers2[j]=temp;
                }
            }
        }

        for (int i = 0; i < entiers.length; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }

            System.out.println(entiers[i]);


            for (int j = 0; j <entiers2.length-i ; j++) {
                System.out.print(" ");
            }
            System.out.println(entiers2[i]);

        }

    }
}
