// MULTIPLICATION 

import java.util.*;

class darr8{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the  cols :");
        int m = sc.nextInt();

        int [][] a = new int[n][m];
        int [][] b = new int[n][m];
        int [][] c = new int[n][m];
        
        System.out.println("Enter the 1'st matrx : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2'nd matrx : ");
        
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix multiplication........");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                c[i][j] = 0;
                for (int k = 0;k<n;k++)
                {
                    c[i][j] +=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("* * ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}