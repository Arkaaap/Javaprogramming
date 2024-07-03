// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
class cf8{
    public static int average(int n) {
        int i,sum = 0;
        for (i=1;i<=n;i++){
            sum = sum+i;
        }
        int av = sum/n;
        return av;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int n = sc.nextInt();
        System.out.println("The average of 3 numbers from user  = "+ average(n));
    }
}