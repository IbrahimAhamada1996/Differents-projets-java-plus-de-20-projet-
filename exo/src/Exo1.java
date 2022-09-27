public class Exo1 {

    public static void main(String[] args) {
        Exo1 e = new Exo1();
        e.CheckPassFail(6);
    }

   void CheckPassFail(int marqk){
        if (marqk >= 50){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        System.out.println("DONE");
   }
}
