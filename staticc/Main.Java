package staticc;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog tim = new Dog("tim", 9);
        Dog bill = new Dog("bill", 10);
        Dog.count = 7;
        System.out.println(tim.count);
    }
}
