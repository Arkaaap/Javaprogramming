// combination 


import java.util.*;
class f5{
    public static int fact  (int n) {
        if (n<=2){
            return 1;
        }
        return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Enter the n value :");
            int n = sc.nextInt();
            System.out.println("Enter the r value :");
            int r = sc.nextInt();

            int nfact  = fact(n);
            int rfact  = fact(r);
            int nrFact  = fact(n-r);
            int ncr= nfact/(rfact*nfact);
            System.out.println("The combination is  = " +" "+ ncr);
    }
}