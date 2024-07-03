// Write an infinite loop using do while condition.
import java.util.*;
class cf13{
    public static void destruction() {
        do { 
            System.out.println("You have gone into infinite loop!!!");
        } while (true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        destruction();
    }
}