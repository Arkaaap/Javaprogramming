// divisible by 5 or not 
import java.util.*;
class con1{
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt ();
        if (n % 5 == 0){
            System.out.print("Divisible by 5");
        }
        else {
            System.out.print("not divisible by 5 !!");
        }
    }
}