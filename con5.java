// three digit  = True
// else  = False 


import java.util.*;

class con5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the number :");
        int n = sc.nextInt ();
        if (n>99 && n<1000){
            System.out.print ("True");
        }
        else {
            System.out.print ("False");
        }
    }
}