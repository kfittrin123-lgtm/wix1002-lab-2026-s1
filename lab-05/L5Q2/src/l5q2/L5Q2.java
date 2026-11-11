/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q2;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L5Q2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int temp;
        int[] numbers = new int[10];
        int count = 0;
        
        while(count < numbers.length){
            boolean isDuplicate = false;
            temp = rand.nextInt(21);
            
            for(int i = 0; i<count;i++){
                if(numbers[i] == temp){
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate){
                numbers[count] = temp;
                count++;
            }
        }
    }
    
}
