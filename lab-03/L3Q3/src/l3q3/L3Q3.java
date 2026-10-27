/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales voulume: ");
        double salesVolume = input.nextDouble();
        double commission;
        
        if (salesVolume <= 100){
            commission = (salesVolume*5)/100;
            System.out.printf("Total commission: %.2f\n" ,commission);
        }
        else if (salesVolume > 100 && salesVolume <= 500){
            commission = (salesVolume*7.5)/100;
            System.out.printf("Total commission: %.2f\n" ,commission);
        }
        else if (salesVolume > 500 && salesVolume <= 1000){
            commission = (salesVolume*10)/100;
            System.out.printf("Total commission: %.2f\n" ,commission);
        }
        else if (salesVolume > 1000){
            commission = (salesVolume*12.5)/100;
            System.out.printf("Total commission: %.2f\n" ,commission);
        }
        else
            System.out.println("You have entered a wrong value");
        
    }
    
}
