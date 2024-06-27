//MAKE A PROGRAM IN JAVA WHICH DEMONTRATES A LENGTH OF A N SIZE ARRAY 

import java.util.*;
class arr10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt ();
        int [] arr = new int [n];
        System.out.println("Taking input :");
        int i,j,c =0;
        for (i=0;i<n;i++){
            arr[i] = sc.nextInt ();
        }
        for (i=0;i<=n-1;i++){
            if (arr[i]>=0 && arr[i]<=Integer.MAX_VALUE){
                c++;
            }
        }
        System.out.print("The length of the array is :");
        System.out.println(c);


    }
}