// Write a function that takes in the radius as input and returns the circumference of a circle.


import java.util.*;
class cf11{
    public static double circle_circumference( double radius) {

        return 2*Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double rad = sc.nextDouble();
        System.out.println(circle_circumference(rad));
        
    }
}