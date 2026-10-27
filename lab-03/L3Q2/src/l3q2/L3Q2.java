/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6);
        
        switch (randomNumber){
            case 0:
                System.out.println(randomNumber + " is Zero");
                break;
            case 1:
                System.out.println(randomNumber + " is One");
                break;
            case 2:
                System.out.println(randomNumber + " is Two");
                break;
            case 3:
                System.out.println(randomNumber + " is Three");
                break;
            case 4:
                System.out.println(randomNumber + " is Four");
                break;
            case 5:
                System.out.println(randomNumber + " is Five");
                break;
        }
    }
    
}
