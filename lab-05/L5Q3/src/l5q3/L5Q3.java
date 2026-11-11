/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;

/**
 *
 * @author HP
 */
import java.util.Random;
import java.util.Scanner;
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int N = input.nextInt();
        
        int[][] workHours = new int[N][7];
        
        for(int row = 0; row < workHours.length; row++){
            for(int col = 0; col < workHours[row].length; col++){
                workHours[row][col] = rand.nextInt(1,9);
            }
        }
      
        System.out.println("Sun\tMon\tTue\tWed\tThurs\tFri\tSat\tTotal");
        for(int row = 0; row < workHours.length; row++){
            int sum = 0;
            for(int col = 0; col < workHours[row].length; col++){
                System.out.print(workHours[row][col] + "\t");
                sum += workHours[row][col];
                if(col == workHours[row].length - 1){
                    System.out.print(sum);
                }
            }
            System.out.println();
        }
        
    }
    
}
