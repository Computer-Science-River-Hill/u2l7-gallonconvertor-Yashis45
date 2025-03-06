package org.example; //DO NOT DELETE
import java.util.Scanner ;
class Main { 
    public static void main (String args[]) {
        Scanner Gallon = new Scanner (System.in) ;
         Double in = Gallon.nextDouble() ;
         Double quart = in / 4 ;
         Double pint = in / 8 ;
         Double cup = in / 16 ; 
         Double tablespoons = in / 256 ;
    System.out.println ("Enter the number of gallons:" +Gallon) ; 
    System.out.println ("In +Gallon here are:") ;
    System.out.println(pint) ; 
    System.out.println(quart) ; 
    System.out.println(cup) ; 
    System.out.println(tablespoons) ; 

        
    }
}