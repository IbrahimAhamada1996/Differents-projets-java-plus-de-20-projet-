import java.util.stream.Stream;

public class Exo2 {

    public static void main(String[] args) {
        Exo2 e = new Exo2();
        e.Product1ToN();

    }

    int Product1ToN(){
        int p=1;
        for (int i = 1; i <=7 ; i++ ) {
            p *=i;
        }
        System.out.println(p);
        return p;
    }


}
