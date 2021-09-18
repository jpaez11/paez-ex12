/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * Making a program that will give simple interest, calculated by the formula PeRT
 * 
 */
package exercise12;
import java.util.*;

class Interest{ //class for interest and rates
    double rate;
    double key;
    int years;

    public void read(){
        System.out.print("Enter the rate: ");
        Scanner s = new Scanner(System.in); //object created
        this.rate = s.nextDouble();
        System.out.print("What is the rate of the interest?");
        this.key = s.nextDouble(); //interest rate
        System.out.print("Enter the number of years: ");
        this.years = s.nextInt(); //for the years
    }

public void print(){
    int total= (int)Math.round(rate*(1+rate*years*0.01)); //PeRT
    System.out.println("After this many years "+ years + " at the rate of" + key + "%, the investment will be worth $ " + total); //output
}

public static class solution12 {
        public static void main (String []args){
            Interest i = new Interest(); //reading the class made for interest
            i.read();
            i.print();
        }
    }
}
