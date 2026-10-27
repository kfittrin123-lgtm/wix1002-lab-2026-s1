/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P1Dice1,P2Dice1,P1Dice2,P2Dice2;
        int P1Score,P2Score;
        System.out.print("Player 1 roll the first dice roll: ");
        P1Dice1 = input.nextInt();
        System.out.print("Player 1 roll the second dice roll: ");
        P1Dice2 = input.nextInt();
        System.out.print("Player 2 roll the first dice roll: ");
        P2Dice1 = input.nextInt();
        System.out.print("Player 2 roll the second dice roll: ");
        P2Dice2 = input.nextInt();
        
        P1Score = P1Dice1 + P1Dice2;
        P2Score = P2Dice1 + P2Dice2;
        
        if (P1Score > P2Score)
            System.out.println("Player 1 wins");
        else if (P2Score > P1Score)
            System.out.println("Player 2 wins");
        else
            System.out.println("TIE");
    }
    
}
