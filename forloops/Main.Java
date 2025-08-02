package forloops;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7};
        String [] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++){
            System.out.print("Input:  ");
            String input = sc.nextLine();
            names[i] = input;
        }
        //for-each loop
        for (String n:names) {
            System.out.println(n);
            if (n.equals("tim")) {
                break;
            }
        }

        int count = 0;
        for (int element:arr) {
            System.out.println(element + " " + count);
            count++;
        }
        
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a  5 at index " + i);
            }
        }
      
    }
}
