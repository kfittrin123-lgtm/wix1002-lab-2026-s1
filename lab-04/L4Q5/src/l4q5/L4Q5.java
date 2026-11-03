/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int FinalScore1 = 0,FinalScore2 = 0;
        int P1Score,P2Score;
        
        while(FinalScore1 < 100 && FinalScore2 != 100){
            do{
                System.out.print("Enter the player 1 dice roll: ");
                P1Score = input.nextInt();
                FinalScore1 += P1Score;
                
            }while(P1Score == 6 && FinalScore1 < 100);
            if(FinalScore1 >= 100){
                break;
            }
            
            do{
                System.out.print("Enter the player 2 dice roll: ");
                P2Score = input.nextInt();
                FinalScore2 += P2Score;
                
            }while(P2Score == 6 && FinalScore2 < 100);
            if(FinalScore2 >= 100){
                break;
            }
        
        }
        
        System.out.println("The Player 1 score is: " + FinalScore1);
        System.out.println("The Player 2 score is: " + FinalScore2);
        if(FinalScore1 >= 100){
            System.out.println("Player 1 wins");
        }
        else{
            System.out.println("Player 2 wins");
        }
        
    }
    
}
