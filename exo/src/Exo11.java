public class Exo11 {

    public static void main(String[] args) {
        start(5);
    }


    static  void start(int rows){
        for (int i = rows; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }
}
