// TAKE INPUT OF AN ARRAY AND CALCULATE THE SUM OF THE ARRAY 

import java.util.*;
 class arr4{
    public static void main(String[] args) {

        Scanner in  = new Scanner (System.in);

        System.out.print("Enter the size of the array :");

        int size = in.nextInt();

        int sum  = 0;

        int [] arr = new int[size];

        System.out.print("Taking inputt");

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i <=size-1; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i <=size-1; i++) {
            sum+=arr[i];
        }
        
        System.out.println(" " +sum);
        
    }
}