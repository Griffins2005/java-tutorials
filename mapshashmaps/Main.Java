package mapshashmaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Map m = new HashMap();
        Map m = new LinkedHashMap();
        //Map<String, Object>  m = new TreeMap(); // sorted order & keys -same type
        int[] f = {-99, 5, 4, 6, 8, 0, 2, 1, 5};

        Arrays.sort(f, 1, 7);
        for (int i:f) {
            System.out.print(i + ",");
        }


        String str = "hello, my name is tim";
        System.out.println(str.toCharArray());

        for (char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);
            }
            else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        System.out.println(m);
        
        


        m.put("tim", 5);
        m.put("joe", "f76");
        m.put("a", 999);

        boolean z = m.containsValue(5);
        boolean y = m.containsKey(5);
        System.out.println(m.containsKey("b"));
        System.out.println(m.values());
        System.out.println(m);
        System.out.println(z);
        System.out.println(y);
        m.isEmpty();
        m.clear();
        System.out.println(m);
    }
}
