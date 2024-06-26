// palindrome number 

//example 121 , 131 , 171, 1551

import java.util.*;
class loop9{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the n :");
        int n = sc.nextInt();
        int pal = 0, rem = 0,store;
        store  = n;
        while (n!=0){
            rem = rem %10;
            pal = rem*10+pal;
            n /= 10;

        }
        if (pal == store){
            System.out.print("Palimdrome ");
        }
        else {
            System.out.print ("nOt a palindrome ");
        }
    }
}