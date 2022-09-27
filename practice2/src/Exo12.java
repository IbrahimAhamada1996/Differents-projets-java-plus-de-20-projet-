public class Exo12 {

    public static void main(String[] args) {
        Exo12 exo12 = new Exo12();
        exo12.uniqueCaractere("xyyz");
    }

    public void uniqueCaractere(String chaine){
        char[] ch = chaine.toCharArray();
        boolean isUnique = true;
        for (int i = 1; i <ch.length ; i++) {
            System.out.println(ch[i]);

            if(ch[i]==ch[i-1])
               isUnique = false;

        }
        System.out.println("Original String : " + chaine);
        System.out.println("String has all unique characters: " +isUnique);

    }
}
