/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score (negative score to quit): ");
        int score = input.nextInt();
        int max = score , min = score;
        double sum = 0;
        double sum2 = 0;
        int count = 0;
        
        while(score >= 0){
            if (max < score){
                max = score;
            }
            else if (min > score){
                min = score;
            }
            sum += score;
            sum2 += (score * score);
            count++;
            
            System.out.print("Enter a score (negative score to quit): ");
            score = input.nextInt();
        }
        
        double avg = sum/count;
        double standardDeviation = Math.sqrt((sum2 - (Math.pow(sum,2)/count))/(count - 1));
        
        System.out.println("Minimum score: " + min);
        System.out.println("Maximum score: " + max);
        System.out.printf("\nAverage score: %.2f",avg);
        System.out.printf("\nStandarad Deviation score: %.2f",standardDeviation);
        
        
    }
    
}
