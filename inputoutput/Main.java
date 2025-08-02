package inputoutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for name using nextLine()
        System.out.print("What is your name? ");
        String name = sc.nextLine();   // Reads a line including spaces

        // Ask for an integer score using nextInt()
        System.out.print("Enter an integer score (score1): ");
        int score1 = sc.nextInt();     // Reads the next int, does NOT consume \n

        sc.nextLine(); // <-- This is crucial! Consumes the leftover newline after nextInt()

        // Ask for a score using next()
        System.out.print("Enter your score as a word (score): ");
        String score = sc.next();      // Reads next word (up to whitespace)

        sc.nextLine(); // <-- Consumes leftover newline after next()

        // Convert the score string to an integer
        int x = Integer.parseInt(score);

        // Print results
        System.out.println("Hello, " + name + "!");
        System.err.println("your score is : " + score);
        System.out.println(x);
        System.out.println("Score1:  " + score1);
        System.out.println("Score:  " + score);

        sc.close();
    }
}
