import java.util.*;

class simpleinterest {

    public static void main (String[] args ){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the principal value :");

        float p = sc.nextFloat();

        System.out.print("Enter the rate :");

        float r = sc.nextFloat();

        System.out.print("Enter the time :");

        int t = sc.nextInt();

        float result = (p*r*t)/100;

        System.out.print("The simple Interst is :");

        System.out.print(result);

    }

}
