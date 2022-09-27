package arrays;

public class Exo15 {
    public static void main(String[] args) {
        int[] entiers=new int[]{1,2,4,5,6};
        int target= 6;

        for (int i = 0; i <entiers.length ; i++) {
            for (int j = i+1; j < entiers.length; j++) {
                if(entiers[i]+entiers[j]==target){
                    System.out.println("found (" + entiers[i] + "," + entiers[j] + ")");
                }
            }
        }

        System.out.println("Target :"+target);
    }
}
