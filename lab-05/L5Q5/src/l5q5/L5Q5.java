/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Random;
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[20];
        
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = rand.nextInt(101);
        }
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i = 0; i < numbers.length;i++){
            if(i == numbers.length -1){
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        
        System.out.println("\nArray in descending order");
        for(int i = 0; i < numbers.length - 1;i++){
            for(int j = 0; j < numbers.length - 1 - i; j++){
                if (numbers[j] < numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < numbers.length;i++){
            if(i == numbers.length -1){
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        
        System.out.print("\nEnter a number to search: ");
        int num = input.nextInt();
        
        int linearIndex = -1;
        int linearComparison = 0;
        for(int counter = 0; counter < numbers.length; counter++){
            linearComparison ++;
            if(numbers[counter] == num){
                linearIndex = counter;
                break;
            }
        }
        if(linearIndex != -1){
            System.out.println(num + " found");
            System.out.println("Linear Search - " + linearComparison + " loop(s)");
        }
        else{
            System.out.println(num + " not found");
        }
        
        int low = 0;
        int high = numbers.length - 1;
        int middle;
        int binaryIndex = -1;
        int binaryComparison = 0;
        
        while (low <= high){
            binaryComparison++;
            middle = (high + low)/2;
            if(num == numbers[middle]){
                binaryIndex = middle;
                break;
            }
            else if(num > numbers[middle]){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        if(binaryIndex != -1){
            System.out.println(num + " found");
            System.out.println("Binary Search - " + binaryComparison + " loop(s)");
        }
        else{
            System.out.println(num + " not found");
        }
        
        
    }
    
}
