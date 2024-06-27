////FIND THE TOTAL NUMBERS OF PAIRS IN AN ARRAY WHO'S SUM IS EQUAL TO A GIVEN VALUE 'X'
// example = int [5]arr = {1,2,3,4,5}
//x = 7 
// 5+2 = 7, 4+3 = 7
// The total no will be 2 (ans);

import java.util.*;

class arr8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int i,j,pairs = 0;
        System.out.println("Taking input :");
        for (i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of 'X'");
        int x = sc.nextInt();

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]+arr[j]== x){
                    pairs++;
                }
            }
              
        }

        System.out.println(" " +pairs);

    }
}