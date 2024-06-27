// REVERSE AN ARRAY USING REVERSE LOOP 

import java.util.*;
class arr12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = sc.nextInt();
        // System.out.println("Enter the x:");
        // // int x = sc.nextInt();
        int [] arr = new int [n];
        // int c = 0;
        System.out.println("Taking input :");

        int i;
        for ( i = 0; i <=n-1; i++) {
            arr[i]= sc.nextInt();

        }

        System.out.println("Reversing the array.....");
        for (i=n;i>=0;i--){
           System.out.println(arr[i]);

        }
     

    }
}