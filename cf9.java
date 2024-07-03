// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
class cf9{
    public static int sum_average(int n) {
        int i,sum = 0;
        for (i=1;i<=n;i++){
            if (i%2!=0){
                sum = sum+i;
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        System.out.println("The sum of "+ n +" Numbers = "+sum_average(n));
    }
}