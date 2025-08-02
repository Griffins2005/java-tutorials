package setslists;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Set<Integer> t = new HashSet<Integer>();
        // Set<Integer> t = new TreeSet<Integer>();  //gives an order
        Set<Integer> t = new LinkedHashSet<Integer>();
        t.add(5);
        t.add(1);
        t.add(3);
        t.add(5);
        t.add(-8);
        System.out.println(t);

        boolean x = t.contains(5);
        System.out.println(x);

        int b = t.size();
        System.out.println(b);

        t.remove(1);
        System.out.println(t);

        t.clear();
        boolean y = t.isEmpty();
        System.out.println(y);

        // ArrayList<Integer> z = new ArrayList<Integer>();
        LinkedList<Integer> z = new LinkedList<Integer>();
        z.add(1);
        z.add(2);
        z.add(0);
        z.add(6);
        z.add(8);
        System.out.println(z);
        System.out.println(z.get(0));

        z.set(1, 5);
        System.out.println(z);

        System.out.println(z.subList(1,3));

    }
}
