import java.util.*;
public class profitloss {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the cost price :");

        float cp = sc.nextFloat ();
        
        System.out.print("Enter the selling price :");

        float sp = sc.nextFloat();

        if (sp>cp) {

            System.out.print("Profit");
        }
        else if (sp<cp){

            System.out.print("Loss!!!");

            System.out.print("The loss is : ");

        System.out.print(sp-cp);

        }
        
        else {
            
            System.out.print ("NPNL");
        }
        
    }
}