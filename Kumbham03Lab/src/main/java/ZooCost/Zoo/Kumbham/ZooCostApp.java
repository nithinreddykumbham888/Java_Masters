
package ZooCost.Zoo.Kumbham;
import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class ZooCostApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the interactive Zoo cost app! Please answer the following questions.");
        System.out.println("Select an Adventure - either 1,2 or 3:");
        int Adventure = scan.nextInt();
        System.out.println("How many visitors:");
        int Visitors = scan.nextInt();
        System.out.println("Are you a member (true or false):");
        boolean member = scan.nextBoolean();
        System.out.println("Are you a first time visitor (true or false):");
        boolean fvisitor = scan.nextBoolean();
        System.out.println("Do you have coupon (true or false):");
        boolean coupon = scan.nextBoolean();
        ZooCostCalculator calc = new ZooCostCalculator(Adventure,Visitors,member,fvisitor,coupon);
        if(Adventure<1 || Adventure>3 || Visitors<=0 || member==true && fvisitor==true){
            if(Adventure<1 || Adventure>3){
                System.out.println("Adventure number must be 1 or 2 or 3.");
            }
            if(Visitors<=0){
                System.out.println("Passenger number can't be zero.");
            }
            if(member==true && fvisitor==true){
                System.out.println("User cannot be member and first time visitor.");
            }
            if(Adventure<1 || Adventure>3 || Visitors<=0 || member==true && fvisitor==true)
            {
                System.out.println("Please try again.");
            }
          }
        else{
                System.out.println("\n"+"*******************************"+"\n");
                System.out.println(""+calc.toString());
                System.out.println("\n"+"*******************************"+"\n");
                System.out.println(""+calc.printReceipt());
        }
        
    }
    
}
