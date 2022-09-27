import java.util.ArrayList;
import java.util.List;

public class Exo10 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        number(numbers);
    }

    public static void number(List<Integer> numbers){
        int even= 0;
        int odd = 0;
        for (int i = 0; i <numbers.size() ; i++) {

            if (i%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
