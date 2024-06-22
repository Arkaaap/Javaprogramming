import java.util.*;
public class greater3{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number :");

        int a = sc.nextInt();

        System.out.print("Enter the 2nd number :");

        int b = sc.nextInt();

        System.out.print("Enter the 3rd number :");

        int c = sc.nextInt();

        if (a>b && a>c){

            System.out.print("The greates among is :");

            System.out.println(a);

        }
        else if (b>a && b>c){

            System.out.print("The greates among is :");

            System.out.println (b);
        }
        
        else {

            System.out.print("The greates among is :");
            System.out.println(c);
        }
    }
}