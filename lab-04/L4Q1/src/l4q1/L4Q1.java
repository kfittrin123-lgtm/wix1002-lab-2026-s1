/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.print("\nThe factors are: ");
        for(int i = 1; i <= num;i++){
            if(num%i == 0){
                System.out.print(i);
                if(i == num){
                    break;
                }
                else{
                    System.out.print(", ");
                }
            }
        }
        System.out.println("");
        input.close();
    }
    
}
