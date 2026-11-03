/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int innerSum = 0;
        int totalSum = 0;
        for(int i = 1; i <= n;i++){
            innerSum += i;
            totalSum += innerSum;
        }
        System.out.println("the total Sum is: " + totalSum);
    }
    
}
