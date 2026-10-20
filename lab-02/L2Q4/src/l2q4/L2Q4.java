/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int UserInput = input.nextInt();
        
        int hours = UserInput/3600;
        int minutes = (UserInput%3600)/60;
        int seconds = (UserInput%3600)%60;
        
        System.out.println(UserInput + " seconds is " + hours + " hours," + minutes + " minutes and " + seconds + " seconds");
        // TODO code application logic here
    }
    
}
