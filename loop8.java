// n natural numbers sum 


import java.util.*;

class loop8{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the n:");
        int n = sc.nextInt();
        int sum = 0;
       for (int i=0;i<n;i++){{
        sum = sum+i;
       }}
        System.out.print (sum);
    }
}