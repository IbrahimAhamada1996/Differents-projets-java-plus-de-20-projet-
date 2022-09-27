import Difficult.Calculator;
import Easier.Company;
import Easier.Person;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Company company = new Company();
        Calculator calculator = new Calculator();
        calculator.setCurrentValue(3);
        calculator.reset();
        System.out.println(calculator.add(74));

        System.out.println(calculator.pow(3,3));
        Person p = new Person("ibrahim","Ahamada",4);
        Person p2 = new Person("ee","po" );
        Arrays.asList(p,p2).stream().map(Person::getFullName).forEach(System.out::println);
    }
}
