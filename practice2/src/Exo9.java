public class Exo9 {

    public static void main(String[] args) {
        String str="Python";
        addString(str);
    }

    static void  addString(String str){
        char[] ch =  str.toCharArray();
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            String chaine = ch[str.length()-3]+""+ch[str.length()-2]+""+ch[str.length()-1];
            str2 = chaine+""+str+""+chaine;
            System.out.println(str2);
            break;
        }
    }
}
