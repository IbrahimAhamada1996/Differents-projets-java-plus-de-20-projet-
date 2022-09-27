public class Exo8 {

    public static void main(String[] args) {
        Exo8 exo8 = new Exo8();
        String str1 ="Python";
        String str2 ="";
        exo8.createNewSentence(str1,str2);
    }

    void createNewSentence(String str1,String str2){
        String  newSentence ="";

        if (!str1.isEmpty() && !str2.isEmpty()){
            newSentence = str1.charAt(0)+""+str2.charAt(0);
        }else if( str1.isEmpty() && str2.isEmpty()){
            newSentence = "##";

        }else if(str2.isEmpty()){
            newSentence = str1.charAt(0)+"#";
        }else if(str1.isEmpty()){
            newSentence = "#"+str2.charAt(0);
        }

        System.out.println(newSentence);
    }
}
