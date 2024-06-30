// 1 2 3 4
// 1 2 3 4
// 1 2 3 4







import java.util.*;
class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n :");
        int n= sc.nextInt();
        int i,j;

        for (i=1;i<n;i++){
            for (j=1;j<n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}