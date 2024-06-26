// ARITHMETIC PROGRESSION

import java.util.*;
class loop4{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print ("Enter the n:");
        int n = sc.nextInt();
        System.out.print ("Even number ap:");
        for (int i=4;i<=2*n;i+=2){
                System.out.println (i);
        }
    }
}