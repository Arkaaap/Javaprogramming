//TAKE AN ARRAY AS INPUT FROM THE USER AND SEARCH FOR A GIVEN NUMBER X IF FOUND THEN PRINT THE INDEX ELSE PRINT THE -1

import java.util.*;
class arr11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  = sc.nextInt();
        System.out.println("Enter the x:");
        int x = sc.nextInt();
        int [] arr = new int [n];
        int c = 0;
        System.out.println("Taking input :");

        int i;
        for ( i = 0; i <=n-1; i++) {
            arr[i]= sc.nextInt();

        }
        for (i=0;i<=n;i++){
            if (arr[i] == x){
                System.out.print("The target element is /x :" + i);
            }

        }
     

    }
}