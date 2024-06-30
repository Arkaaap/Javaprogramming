//TRANSPOSE OF  A MATRIX  and clock wise 90*

import java.util.*;
class darr9{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the cols :");
        int m = sc.nextInt();

        int [][] a= new int[n][m];

        System.out.println("Taking input :");

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("Transpose ::");


        for (int i=0;i<n;i++)
        {
            for (int j=i;j<m;j++)
            {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

      
        System.out.println("Before transposing.....");

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    

        System.out.println("After transposing.....");


        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.println("90 * clock wise.....");

        for (int i=0;i<n;i++)
        {
            
            int j = 0;
            int k = n-1;
            while (j<k)
            {
                int t = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = t;
                j++;
                k--;
            }
        }


        System.out.println("Printing after rotating clock wise 90* ....");

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("End of the program !!!");

    }
    

}
