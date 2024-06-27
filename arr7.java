//FIND THE DIFFERENCE BETWEEN SUM OF ELEMENTS AT EVEN INDICES TO THE SUM OF ELEMENTS AT ODD INDICES 


// a = 10 , b = 10 c = a-b = 0
// a = 90 , b = 98 = c = a-b = 8 remaining part of the summation object will be always considered as difference b/w those integrals


import java.util.*;
class arr7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt ();
        int [] arr = new int [n];
        int even = 0,  odd = 0;
        int i;
        System.out.print("Taking input :");
        for (i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++){
            if (i%2 == 0){
                even = even+arr[i];
            }
            else {
                odd = odd+arr[i];
            }
        }
        System.out.print("The difference bw even and odd is :");
        System.out.println(even-odd);
    }
}

// EVEN = 4+2 = 6
// ODD = 5+3+1 = 9
// even - oddd = 9-6 = 3 (Ans);