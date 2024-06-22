import java.util.*;
public class voting{
    public static void main (String [] args){
        System.out.println ("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if (n>=18){
            System.out.println("yes you can vote !!");
        }
        else {
            System.out.println ("Nope you cannot vote !!");
        }
    }
}