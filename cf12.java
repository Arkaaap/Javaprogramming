// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
class cf12{
    public static void age(int n) {
        if (n>=18 && n<=99){
            System.out.println("You are eligible ");
        }
        else {
            System.out.println("Not eligible ");;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age :");
        int age  = sc.nextInt();
        age(age);

    }
}