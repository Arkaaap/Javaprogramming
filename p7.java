// 1 1 1 1
// 2 2 2 2
// 3 3 3 3







import java.util.*;
class p7{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n :");
        int n= sc.nextInt();
        int i,j;

        for (i=1;i<n;i++){
            for (j=1;j<n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}