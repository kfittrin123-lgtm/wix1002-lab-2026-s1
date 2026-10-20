/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Fahrenheit");
        double Fahrenheit = input.nextDouble();
        
        double Celcius = (Fahrenheit - 32)/1.8;
        System.out.printf("The temperature in degree Celcius is: %.2f",Celcius);
    }
    
}
