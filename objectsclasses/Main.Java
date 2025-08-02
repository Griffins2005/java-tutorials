package objectsclasses;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat h = new Cat("tim", 4, 5);
        Cat b = new Cat("bob", 7);
        Cat joe = new Cat("joe");
        h.speak();
        b.speak();
        joe.speak();



        Dog tim = new Dog("tim", 4);
        tim.speak();
        Dog bill = new Dog("bill", 9);
        bill.speak();
        Dog bob = new Dog("bob", 11);
        bob.speak();

        int x = tim.getAge();
        System.out.println(x);
        tim.setAge(10);
        System.out.println(tim.getAge());
        tim.speak();
        //tim.add2(); // This will not work because add2 is private 



        Scanner sc = new Scanner(System.in);
        sc.next(); // sc - object .next() - method
        // int x = 5;
        // String str = "hello";
        // str.length(); // str - object .length() - method

        tim("Tim!", 4);

        System.out.println(add2(6));
        System.out.println(str("hi"));
    }

    public static void tim(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "fgytyh";
    }
}
