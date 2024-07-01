// *
//* *

import java.util.*;
class p12{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        int i,j;

        for (i=0;i<=n;i++){
            for (j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}