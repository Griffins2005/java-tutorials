package operators;
public class Main {
    public static void main(String[] args) {
        int x = 21;
        int y = 10;
        int z = 5;
        int sum = x + y;
        double u = z / y;
        int u1 = z / y;
        double u2 = (double)z / y;
        double v = z % y;
        int b = z * y;
        double d = Math.pow(x, y);

        System.out.println(sum);
        System.out.println(u);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(b);
        System.out.println(d);
        System.out.println(v);
    }
}
