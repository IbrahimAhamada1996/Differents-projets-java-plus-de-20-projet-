package multidimensionalArray;

public class ExoM3 {
    public static void main(String[] args) {
        int[] entiers =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < entiers.length; i++) {
            for (int j = i+1; j <entiers.length ; j++) {
                if (entiers[i]<entiers[j]){
                    int temp=entiers[i];
                    entiers[i]=entiers[j];
                    entiers[j]=temp;
                }
            }
        }
        for (int i = 0; i < entiers.length; i++) {

            for (int j = 0; j <entiers.length-i ; j++) {
                System.out.print(" ");
            }
            System.out.println(entiers[i]);
        }
    }
}
