/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = 0*0;
        System.out.print("Enter the first coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter the second coordinate: ");
        int y = input.nextInt();
        
        if (Math.sqrt((x*x)+(y*y)) <= radius)
            System.out.println("the coordinate is inside the circle");
        else
            System.out.println("the coordinate is outside the circle");
    }
    
}
