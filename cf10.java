// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
class cf10{
    public static void greater(int a,int b) {
        if (a>b){
            System.out.println(a+" Is the largest :");

        }
        else if (b>a){
            System.out.println(b+" Is the largest ");
        }
        else {
            System.out.println("THEY ARE EQUAL ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n 1'st number :");
        int a = sc.nextInt();
        System.out.println("Enter the 2'nd number :");
        int b = sc.nextInt();
        greater(a, b);
        
    }
}