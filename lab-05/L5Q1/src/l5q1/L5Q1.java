/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;

/**
 *
 * @author HP
 */
import java.util.Random;
import java.util.Scanner;
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int N = input.nextInt();
        int[] studentScores = new int[N];
        
        for(int i = 0; i < studentScores.length; i++){
            studentScores[i] = rand.nextInt(101);
            System.out.print(studentScores[i] + ", ");
        }
        
        int max = studentScores[0], min = studentScores[0];
        double avg,sum = 0;
        
        for(int j = 0; j<studentScores.length; j++){
            if(studentScores[j] > max){
                max = studentScores[j];
            }
            else if(studentScores[j] < min){
                min = studentScores[j];
            }
            
            sum += studentScores[j];
            
        }
        
        avg = sum/N;
        
        System.out.println("\nHighest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Average Score: " + avg);
        
    }
    
}
