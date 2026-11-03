/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(Integer.MAX_VALUE);
        int count = 0;
        System.out.println("the random generated number is: " + number);
        int temp = number;
        
        do{
            count++;
            temp /= 10;
            
        }while(temp>0);
        
        System.out.println("the number of digit is: " + count);
        
    }
    
}
