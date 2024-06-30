// find the max and min in 2D array 

import java.util.*;

class darr5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the rows :");

        int n = sc.nextInt();

        System.out.println("Enter the cols :");

        int m = sc.nextInt();

        int [][] a = new int[n][m];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i,j;
        System.out.println("Taking input :");

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Finding the max value .....");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (max<a[i][j]){
                    max = a[i][j];
                }
            }
        }

        System.out.println("Finding the min value ....."); 
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                if (min > a[i][j]){
                    min = a[i][j];
                }
            }
        }

        System.out.print("Max is : " + max);
        System.out.println(" "+ "Min is : "+ min);
    }
}