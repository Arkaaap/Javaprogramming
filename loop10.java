// reverse a number 


import java.util.*;
class loop10{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = in.nextInt();
        int c = 0;
        int rem ;
        while (n!=0){
            rem = n%10;
            n/= 10;
            c = c*10+rem;
        }
            System.out.println(c);
    }
}