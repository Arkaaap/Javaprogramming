// // natural numbers in reverse 

// import java.util.*;
// class loop7{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print ("Enter the n:");
//         int n = sc.nextInt();
//         for (int i=n;i>0;i--){{
//             System.out.println (i);
//         }}
//     }
// }














// natural numbers in reverse in while 

// import java.util.*;
// class loop7{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print ("Enter the n:");
//         int n = sc.nextInt();
//         int i = 0;
//         while (n>0){
//             System.out.println(n);
//             n--;
//         }
//     }
// }













// natural numbers in reverse 

import java.util.*;
class loop7{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the n:");
        int n = sc.nextInt();
        int i = 0;
        do{
            System.out.println(n);
            n--;
        }
        while (n>0);
    }
}