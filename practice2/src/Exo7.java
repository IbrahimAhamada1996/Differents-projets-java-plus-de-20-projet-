public class Exo7 {

    public static void main(String[] args) {
        Exo7 exo7 = new Exo7();
        String str="The quick brown fox jumps over the lazy dog.";
        exo7.penultimate(str);
    }

    void penultimate(String str){
       String[] words= str.split(" ");

        for (int i = 1; i <words.length ; i++) {

            System.out.println("Penultimate word:" + words[words.length-2]);
            break;
        }
    }
}
