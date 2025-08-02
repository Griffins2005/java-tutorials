package conditionals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 21;
        int y = 10;
        int b = 5;
        String z = "hello";
        String v = "hell0";
        // > < == <= != >=
        boolean compare = x < y;
        boolean compa = x < y && b < y;
        boolean comp = x < y || b < y;
        boolean com = !(x < y || b < y);
        boolean compar = z == v;

        System.out.println(z.equals("hello"));
        System.out.println(compare);
        System.out.println(compa);
        System.out.println(comp);
        System.out.println(com);
        System.out.println(compar);

        // nested statements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (age >= 18) {
            System.out.println("You are an adult.");
            System.out.print("Your favorite food : ");
            String food = sc.nextLine();

            if (food.equals("pizza")){
                System.out.println("Mine too!");
            } else {
                System.out.println("Not mine");
            }

        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }

        sc.close();
    }
}
