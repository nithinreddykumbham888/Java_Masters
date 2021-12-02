/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.nithinreddykumbhamproject1;
        
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 *
 * @author S545694
 */
public class App {

    public static IntFunction divideBy(int divisor) {
        return x -> x / divisor;
    }

    public static Function<Double, Double> divideBy(double divisor) {
        return x -> x / divisor;
    }

    public static BiFunction<String, String, Boolean> contains() {
        return (str1, str2) -> str1.contains(str2);
    }
    
    public static Function<String, Boolean> contains(String str) {
        return s -> s.contains(str);
    }

 

   // use new Java 8 lambda (unnamed / anonymous) functions
    public static Function<String, String> toLowerCase = (var x) -> x.toLowerCase();


  public static void main(String[] args) {

        var lowerGreeting = App.toLowerCase.apply("Hello");
        System.out.println(lowerGreeting);
  
        System.out.println(divideBy(3).apply(47));
        System.out.println(divideBy(2).apply(18));
        System.out.println(divideBy(17).apply(3));
        System.out.println(divideBy(5).apply(17));
        System.out.println();

        System.out.println(divideBy(3.0).apply(47.0));
        System.out.println(divideBy(2.0).apply(18.0));
        System.out.println(divideBy(17.0).apply(3.0));
        System.out.println(divideBy(5.0).apply(17.0));
        System.out.println();
        
        System.out.println(contains().apply("bearcats", "bear"));
        System.out.println(contains().apply("bearcats", "arc"));
        System.out.println(contains().apply("bearcats", "arce"));
        System.out.println();
        
        System.out.println(contains("bear").apply("bearcats"));
        System.out.println(contains("arc").apply("bearcats"));
        System.out.println(contains("arce").apply("bearcats"));
    }
    
}


  
