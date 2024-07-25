import java.util.*;
class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the n :");
        int n = sc.nextInt ();
        System.out.print ("Enter the r :");
        int r = sc.nextInt();
        System.out.print ("The combination of "+n+" "+r+" "+"is "+nCr(n,r));
    }
    public static int fact (int n){
        if (n<=2){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int nPr(int n , int r)
    {
        int nfact  = fact(n);
        int rfact  = fact(r);
        int nrfact = fact(n-r);
        return nfact/(nrfact);
    }
}
