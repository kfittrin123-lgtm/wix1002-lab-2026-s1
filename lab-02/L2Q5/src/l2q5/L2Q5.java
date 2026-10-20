/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10001);
        
        int digit1 = number%10;
        int digit2 = (number/10)%10;
        int digit3 = (number/100)%10;
        int digit4 = (number/1000)%10;
        int digit5 = (number/10000)%10;
        
        int sum = digit1 + digit2 + digit3 + digit4 + digit5;
        
        System.out.println("The random number is: " + number);
        System.out.println("The sum of all the numbers in the random number is: " + sum);
        // TODO code application logic here
    }
    
}
