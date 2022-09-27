import java.awt.*;
import java.util.Arrays;

public class Exo5 {

    public static void main(String[] args) {
        Exo5 exo5 = new Exo5();
        String str="the quick brown fox jumps over the lazy dog.";
        exo5.capitalise(str);
    }

    void capitalise(String str){
        String[] words = str.split(" ");
        String upper_case_line = "";
        for (int i = 0; i <words.length ; i++) {
           upper_case_line += Character.toUpperCase(words[i].charAt(0))+words[i].substring(1)+" ";
        }
        System.out.println("str = " + str);
        System.out.println("str uppercase = " + upper_case_line);
    }
}
