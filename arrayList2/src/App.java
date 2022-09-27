import java.util.*;

public class App {

    public static void main(String[] args) {
        
        List<String> fruits = List.of("Bananas","Pomme");
        fruits = new ArrayList<>(fruits);
        fruits.addAll(fruits);
        fruits.add("Orange");

        for (String fruit:fruits
             ) {
            System.out.println("fruit = " + fruit);
        }

        System.out.println("*******************************************");

        fruits.forEach(System.out::println);
        System.out.println("*******************************************");
        fruits.forEach((String s)->System.out.println(s));
        System.out.println("*******************************************");

        for (int i = 0; i <fruits.size() ; i++) {
            System.out.println("args = " + fruits.get(i));
        }
        System.out.println("*******************************************");

        Iterator fruitsIterator = fruits.iterator();
       Optional o =  Optional.of(fruits);
 
        while (fruitsIterator.hasNext()){

            System.out.println("args = " + fruitsIterator.next());
        }
    }
}
