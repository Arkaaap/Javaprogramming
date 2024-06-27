// take input of an array and print the corresponding values 

import java.util.*;
public class arr3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array length :");
        int n = in.nextInt();
        int []arr = new int [n];
        System.out.println("Taking input of the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i]+" " +" \n");
        }
        System.err.println("End of the program ");

    }
}