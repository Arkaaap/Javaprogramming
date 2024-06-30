// FIND THE MAX ELEMENT AND IT'S INDEX 

import java.util.*;
class darr6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows  :");
        int n= sc.nextInt();
        System.out.println("Enter the cols :");
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        int i,j,max = Integer.MIN_VALUE;
        System.out.println("Taking input :");

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
               a[i][j] =  sc.nextInt();
            }
        }

        System.out.println("Finding the max value ...");

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (max < a[i][j]){
                    max = a[i][j];
                }
            }
        }

        System.out.print("The max value is " + max);
        System.out.println("The index of max is " +i);

        
    }
}