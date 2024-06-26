// ARMSTRONG 

import java.util.*;
class loop1{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int arm = 0,store,n,rem = 0;
        System.out.print ("Enter the n :");
        n = sc.nextInt();
        store  = n;
        while (n!=0){
            rem = n%10;
            arm = rem*rem*rem+arm;
            n = n/ 10;
        }
        if (store == arm){
            System.out.print ("Armstrong ");
        }
        else {
            System.out.print ("Not !!");
        }
    }
}