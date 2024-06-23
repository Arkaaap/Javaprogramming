//leapyear or not 

import java.util.*;
class con3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the year :");
        int n = sc.nextInt ();
        if (n%400 == 0 || n%4 == 0 ){
            System.out.print ("Leapyear");
        }
        else {
            System.out.print ("Not a leapyear!!!");
        }
    }
}