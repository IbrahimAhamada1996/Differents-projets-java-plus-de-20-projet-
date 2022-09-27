public class Exo6 {

    public static void main(String[] args) {
        Exo6 exo6 = new Exo6();
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";;
        exo6.lowercase(str);
    }

    void lowercase(String str){
        System.out.println("str = " + str);
        System.out.println("str Lowercase= " + str.toLowerCase());
    }
}
