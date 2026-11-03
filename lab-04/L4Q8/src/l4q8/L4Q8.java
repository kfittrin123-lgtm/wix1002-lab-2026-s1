/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

/**
 *
 * @author HP
 */
import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int RandomNumber = rand.nextInt(101);
        int count = 0;
        int num = 2;
        System.out.println("The RandomNumber generated is: "+RandomNumber);
        System.out.print("First "+RandomNumber+" prime numbers: ");
        
        while(count<RandomNumber){
            int divisor =0;
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    divisor++;
                    break;
                }
            }
            
            if(divisor ==0){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}