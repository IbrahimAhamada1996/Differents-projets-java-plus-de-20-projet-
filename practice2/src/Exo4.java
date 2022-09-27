public class Exo4 {

    public static void main(String[] args) {
        Exo4 exo4 = new Exo4();
        exo4.divisible();
    }

    void divisible(){
        System.out.println("Divisible by 3");
        for (int i = 1; i <=100 ; i++) {
            if (i%3 == 0 ){
                System.out.print(i+"\t");
            }
        }
        System.out.println("\nDivisible by 5");
        for (int i = 1; i <=100 ; i++) {
            if (i%5 == 0 ){
                System.out.print(i+"\t");
            }
        }
        System.out.println("\nDivisible by 3 and 5");
        for (int i = 1; i <=100 ; i++) {
            if (i%3 == 0 && i%5 == 0  ){
                System.out.print(i+"\t");
            }
        }
    }
}
