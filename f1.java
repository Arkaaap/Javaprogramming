import java.util.*;
class f1{
    public static int sum (int a,int b) {
        return  a+b;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a,b: "+ " ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is = "+ sum(a, b));
    }
}