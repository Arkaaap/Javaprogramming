// calculator 

import java.util.*;

class con4{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print ("Enter the 1st number :");

        int n = sc.nextInt ();

        System.out.print ("Enter the 2nd number :");

        int m = sc.nextInt ();

        System.out.print ("Enter the operator :");

        char opt = sc.next().charAt(0);


     if (opt  == '+'){
        System.out.print (n+m);
     }

     else if (opt == '-'){
        System.out.print (n-m);
     }

     else if (opt == '*'){
        System.out.print (n*m);
     }

     else if (opt == '/'){
        System.out.print (n/m);
     }

     else {
        System.out.print ("Try again later !!!");
     }


    }

}













