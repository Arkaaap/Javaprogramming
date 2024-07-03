//pascal triangle


import java.util.*;
class f6{
    public static int fact  (int n) {
        if (n<=2){
            return 1;
        }
        return n*fact(n-1);
        
    }

    


    public static int combination(int n,int r) {
        
        int nfact  = fact(n);
        int rfact  = fact(r);
        int nrFact  = fact(n-r);
        int ncr= nfact/(rfact*nfact);
        return  ncr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Enter the n value :");
            int n = sc.nextInt();
            // System.out.println("Enter the r value :");
            // int r = sc.nextInt();
            int i,j,icj ;
            for (i=1;i<=n;i++){
                for (j=1;j<=i;j++){
                         icj = combination(i, j);
                         System.out.print(" " +icj);
                }
                System.out.println();
                
            }
    }
}