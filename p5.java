// * * * *
// * * * *
// * * * *







import java.util.*;
class p5{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n :");
        int n= sc.nextInt();
        int i,j;

        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}