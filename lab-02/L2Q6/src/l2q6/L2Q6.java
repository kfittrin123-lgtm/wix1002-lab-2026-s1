/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the amount of water in gram:");
        double M = input.nextDouble();
        double MinKG = M/1000;
        
        System.out.print("\nEnter the initial temperature in Fahrenheit: ");
        double InitialTempF = input.nextDouble();
        
        System.out.print("\nEnter the final temperature in Fahrenheit: ");
        double FinalTempF = input.nextDouble();
        
        double InitialTempC = (InitialTempF - 32)/1.8;
        double FinalTempC = (FinalTempF - 32)/1.8;
        
        double Q = MinKG * (FinalTempC - InitialTempC) * 4184;
        System.out.printf("\nthe energy needed is: %.6e\n",Q);
        // TODO code application logic here
    }
    
}
