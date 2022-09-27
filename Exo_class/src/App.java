import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Car car = new Car("Tesla");
        System.out.println(car.toString());

        Car.message();
    }
}
