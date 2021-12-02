
package JavaConcepts;

import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class Movie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String theaterName;
        String moviename;
        int members;
        boolean choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to see a movie?(true/false)");
        choice = scan.nextBoolean();
        while(choice == true){
        System.out.println("\nEnter Theatre Name");
        theaterName = scan.next();
        System.out.println("\nEnter Movie name");
        moviename = scan.next();
        System.out.println("\nEnter number of family members visiting to show");
        members = scan.nextInt();
        ScreenOne movie = new ScreenOne(theaterName,moviename,members);
        System.out.println("\n"+movie.toString());
        System.out.println("***************************************");
        movie.run();
        System.out.println("\n");
        System.out.println("Do you want to see other movie? (True/False)");
        boolean choice1 = scan.nextBoolean();
        choice = choice1;
        }
        
        if(choice == false){
            System.out.println("Thanks for coming, have a great day");
        }
        
    }
    
}
