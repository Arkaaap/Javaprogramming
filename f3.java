import java.util.*;
class f3{
    public static int div (int a,int b) {
        return  a/b;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a,b: "+ " ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is = "+ div(a, b));
    }
}