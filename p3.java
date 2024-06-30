//   1
//   2 2
//   3 3 3
//   4 4  4



import java.util.*;
class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n :");
        int n= sc.nextInt();
        int i,j;

        for (i=0;i<=n;i++){
            for (j=0;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}