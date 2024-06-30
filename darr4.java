// find the sum of a given matrix nXm


import java.util.*;

class darr4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the cols :");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        int i,j,sum = 0;

        System.out.println("Taking input :");

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                arr[i][j] = sc.nextInt();

            }
        }

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                sum = sum+arr[i][j];
            }
        }


        System.out.println(" "+sum);
    }
}