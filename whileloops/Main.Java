package whileloops;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Type a number: ");
        // int x = sc.nextInt();
        int x = 0;

        // while loop 
        // int count = 0;
        // while (x != 10) {
        //     System.out.println("Type 10 ...");
        //     System.out.print("Type a number:  ");
        //     x = sc.nextInt();
        //     count++;
        // }
        // System.out.println("You tried " + count + " times");
        while (x <= 10) {
            x += 1;
            
        }

        // do while loop
        do {
            System.out.print("Type a number:  ");
            x = sc.nextInt();
        } while (x != 10);
    }
}
