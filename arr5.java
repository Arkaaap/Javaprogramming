// reverse an array user input 

import java.util.*;
class arr5{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the n :");

        int n = in.nextInt();

        int [] arr = new int [n];

        System.out.println("Taking input :");
        

        for (int i = 0; i <=n-1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Original array  :"+" ");

        for (int i = 0; i <=n-1; i++) {
            System.err.println(" " +arr[i]);
        }

        System.out.println("Reverse array :");
            for (int i = 0; i <n; i++) {
                for(int j=i+1;j<=n-1;j++){
                    if (arr[i]<arr[j]){
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }


                for ( i = 0; i <=n-1; i++) {
                    System.err.println(" "+arr[i]);
                }
            }
    }
}