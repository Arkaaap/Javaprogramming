// printing a 2d array userinput  

import java.util.*;
class darr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the cols :");
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        System.out.print("Taking input:");
        int i,j;

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}