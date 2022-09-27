package arrays;

public class Exo11 {

    public static void main(String[] args) {
        String[] chaines = new String[]{"Ibrahim","Ahamada","Sara","Tity","Aloui","Data","Ahamada","Ibrahim"};
        for (int i = 0; i < chaines.length; i++) {
            for (int j = i+1; j <chaines.length ; j++) {
                if(chaines[i]==chaines[j]){
                    System.out.println(chaines[i]);
                }
            }
        }
    }
}
