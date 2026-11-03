/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        double principle = sc.nextDouble();
        System.out.print("Enter interest in %  : ");
        double interest = sc.nextDouble();
        System.out.print("Enter total number of months : ");
        double month = sc.nextDouble();
        double sumOfInterest = 0;
        double unpaidBalance = principle;
        
        System.out.println("Month \tMonthly Payment \tPrinciple \tInterest \tUnpaid Balance \tTotal Interest");
        
        for (int n = 1; n <= month; n++) {
            double a = interest/1200;
            double M = ((principle*a)/(1-Math.pow((1+a), -month)));
            double C = (M*(Math.pow((1+a),(-(1+month-n)))));
            double L = (M-C);
            double R = (L/(a-C));
            sumOfInterest +=L;
            unpaidBalance -= C;
            System.out.printf("%d \t%.2f \t\t\t%.2f \t\t%.2f \t\t\t%.2f \t%.2f",n,M,C,L,unpaidBalance, sumOfInterest);
            System.out.println();
        }
        
    }
}