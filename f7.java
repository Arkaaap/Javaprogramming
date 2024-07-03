//PERMUTATION  


import java.util.*;
class f7{
    public static int fact  (int n) {
        int i,f = 1;
        for (i=2;i<=n;i++){
            f*=i;
        }
        return f;
        
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
            int npr= nfact/nrFact;
            System.out.println("The Permutation is  = " +" "+ npr);
    }
}
