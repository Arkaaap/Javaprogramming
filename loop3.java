// FIBONACCI 

import java.util.*;
class loop3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the n :");
        int n = sc.nextInt();
        int a = 0 ,b = 1,c =  0;
        for (int i=1;i<= n-1;i++){
            a =b;
            b = c;
            c = a+b;
        }
        System.out.print("The fibonacci is :");
        System.out.print (c);
    }
}