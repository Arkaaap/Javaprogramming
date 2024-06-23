// 2 numbers are equal or not 
import java.util.*;
class con2{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number :");
        int a = sc.nextInt ();
        System.out.print ("Enter the 2nd number :");
        int b = sc.nextInt ();
        if (a == b){
            System.out.print ("Equal ");
        }
        else {
            System.out.print("Not equal!!");
        }
    }
}