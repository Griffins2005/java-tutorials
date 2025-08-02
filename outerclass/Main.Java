package outerclass;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.inner();
        // OuterClass.InnerClass in = out.new InnerClass();

        // in.display();

        System.out.println();
    }
}