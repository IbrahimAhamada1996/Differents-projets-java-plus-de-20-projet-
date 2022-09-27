public class Exo10 {

    public static void main(String[] args) {
        grade();
    }

    static  void grade(){
        double math = 5;
        double french = 12;
        double history = 20;
        double sum = math+french+history;
        double moyen = sum/3;

        if (moyen<10)
            System.out.println("Niveau 1");
        if (moyen>=10 && moyen <=15)
            System.out.println("Niveau 2");
        if (moyen>15 && moyen<=20)
            System.out.println("Niveau 3");
    }
}
