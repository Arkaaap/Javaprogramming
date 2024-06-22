import java.util.*;
public class swap {
    public static void main (String [] args){
        System.out.println ("Enter the 1st number :");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = a;
        a = b;
        b = t;
        System.out.print("\n");
        System.out.println (t);
    }
}