/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int N = input.nextInt();
        System.out.println("Pascal Triangle with " + N + " row(s)");
        
        int[][] PascalTriangle = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                if (j == 0 || j == i) {
                    PascalTriangle[i][j] = 1;
                }
                else{
                    PascalTriangle[i][j] = PascalTriangle[i - 1][j - 1] + PascalTriangle[i - 1][j];
                }
            }
        }
        
        for(int row = 0; row < PascalTriangle.length; row++){
            for(int col = 0; col < PascalTriangle[row].length; col++){
                System.out.print(PascalTriangle[row][col] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
