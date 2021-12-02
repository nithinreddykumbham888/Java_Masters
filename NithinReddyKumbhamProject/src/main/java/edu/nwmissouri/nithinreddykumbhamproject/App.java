
package edu.nwmissouri.nithinreddykumbhamproject;

public class App {
    
    public static void main(String[] args) {
        
        System.out.println("Gcd of two given numbers ByBruteForce is : "+App.gcdByBruteForce(20, 5));
        System.out.println("Gcd of two given numbers ByEuclidsAlgorithm is : "+App.gcdByEuclidsAlgorithm(20, 5));

        System.out.println("Gcd of two given numbers ByBruteForce is : "+App.gcdByBruteForce(2000000000, 456));
        System.out.println("Gcd of two given numbers ByEuclidsAlgorithm is : "+App.gcdByEuclidsAlgorithm(2000000000, 456));

        App.mystery(54321);
        App.mystery(42);
    }

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static void mystery(long n) {
        System.out.print(n % 10);
        if ((n / 10) != 0) {
            mystery(n / 10);
        }
    }
        
        
    }
