// COUNT NUMBERS IN A DIGIT 
import java.util.*;
class loop2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the n :");
        int n = sc.nextInt();
        int c = 0;
        while (n!=0){
            n =n/10;
            c++;
        }
        System.out.print (c);
    }
}