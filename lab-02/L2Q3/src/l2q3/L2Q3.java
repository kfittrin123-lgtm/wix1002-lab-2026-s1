/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10,51);
        int b = rand.nextInt(10,51);
        int c = rand.nextInt(10,51);
        int sum = a + b + c;
        double average = (double)sum/3;
        System.out.println("int a: " + a + "\nint b: " + b + "\nint c: " + c);
        System.out.println("The sum of the three random numbers is: " + sum);
        System.out.printf("The average of the three random numbers is: %.2f",average);
        // TODO code application logic here
    }
    
}
