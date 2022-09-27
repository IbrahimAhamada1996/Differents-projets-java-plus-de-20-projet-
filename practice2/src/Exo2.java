public class Exo2 {

    public static void main(String[] args) {
        Exo2 exo2 = new Exo2();
        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
            exo2.count(str);

    }

    public void count(String str){
      char[] ch = str.toCharArray();
      int letter=0;
      int space=0;
      int number=0;
      int other=0;

        for (int i = 0; i < ch.length; i++) {

            if (Character.isLetter(ch[i])){
                letter++;
            }else if (Character.isDigit(ch[i])){
                number++;

            }else if(Character.isSpaceChar(ch[i])){
                space++;
            }else {
                other++;
            }

        }

        System.out.println(str);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);


    }
}
