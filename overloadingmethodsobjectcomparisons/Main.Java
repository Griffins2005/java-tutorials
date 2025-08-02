package overloadingmethodsobjectcomparisons;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student tim = new Student("tim");
        //Student bill = new Student("bill");
        Student bill = new Student("joe");
        Student joe = new Student("joe");

        System.out.println(joe);
        System.out.println(joe == bill);
        System.out.println(joe.equals(bill));
        System.out.println(joe.compareTo(bill));
        System.out.println(joe.compareTo(bill) > 0);
        System.out.println(tim.toString());
    }
}
