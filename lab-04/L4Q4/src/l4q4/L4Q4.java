/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, … , 6 for Saturday): ");
        int FirstDay = input.nextInt();
        
        for(int month = 1 ; month <=8; month++){
            int days = 31;
            if (month == 4 || month ==6){
                days = 30;
            }
            else if(month == 2){
                if (year%400== 0|| year%4 == 0 && year%100!=0){
                    days = 29;
                }
                else{
                    days = 28;
                }
            }
            if( month == 5 || month == 8){
                if(month == 5){
                    System.out.print("\nMay " + year);
                }
                else{
                    System.out.print("\nAugust " + year);
                }
                System.out.print("\nSun  Mon  Tue  Wed  Thu  Fri  Sat");
                for(int i = 0;i < FirstDay;i++){
                    System.out.println("     ");
                }
                
                for(int date = 1; date <= days; date++){
                    System.out.printf("%-5d",date);
                    FirstDay = (FirstDay + 1)%7;
                    
                    if (FirstDay == 0){
                        System.out.println();
                    }
                }
                System.out.println();
                
            }
            else{
                FirstDay= (FirstDay + days)%7;
            }
        }
    }
    
}
