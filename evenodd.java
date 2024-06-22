import java.util.*;
public class evenodd {
    public static void main (String [] args){
        System.out.print("Enter the number :");
        Scanner sc  = new Scanner (System.in);
        int a = sc.nextInt ();
        if (a%2 == 0){
            System.out.print("eVEN");

        }
        else {
            System.out.println ("oDD");
        }
    }
}