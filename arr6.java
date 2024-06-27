// // LARGEST ELEMENT IN AN ARRAY 

// import java.util.*;

// class arr6{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array :");
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//         int max = Integer.MIN_VALUE;
//         System.out.println("taking input :");
//         int i;
//         for (i=0; i<n ;i++){
//             arr[i] = sc.nextInt();
//         }

//         for (i=0;i<n;i++){
//             if (max<i){
//                 max = arr[i];
//             }
//         }
//         System.out.println(" " +max);
//     }
// }


















// SMALLEST ELEMENT IN AN ARRAY 

import java.util.*;

class arr6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int [] arr = new int[n];

        int min = Integer.MAX_VALUE;
        System.out.println("taking input :");
        int i;
        for (i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        for (i=0;i<n;i++){
            if (min>i){
                min = arr[i];
            }
        }
        System.out.println(" " +min);
    }
}