// ADD TWO MATRICES 


import java.util.*;
class darr2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows:");
        int r = sc.nextInt();
        System.out.println("Enter the cols :");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        int [][] brr = new int[r][c];
        int [][] result = new  int[r][c];
        int i,j,sum = 0;
        System.out.println("Taking input of 1st matrix:");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Taking input of 2nd matrix :");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                brr[i][j] = sc.nextInt();
            }
        }
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                result[i][j] = arr[i][j]+brr[i][j];
                sum++;
            }
        }

        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("THE SUM IS "+" ");
        System.out.println(sum);
    }
}