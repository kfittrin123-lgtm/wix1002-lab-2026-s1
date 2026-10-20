/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the car: RM");
        double P = input.nextDouble();
        System.out.print("\nEnter Down payment: RM");
        double D = input.nextDouble();
        System.out.print("\nEnter Interest Rate in %: ");
        double R = input.nextDouble();
        System.out.print("\nEnter Loan duration in year: ");
        int Y = input.nextInt();
        double M = (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("\nThe montly payment is: RM%.2f",M);
    }
    
}