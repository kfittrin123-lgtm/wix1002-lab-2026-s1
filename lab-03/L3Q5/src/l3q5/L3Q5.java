/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        c = input.nextDouble();
        System.out.print("Enter the value of d: ");
        d = input.nextDouble();
        System.out.print("Enter the value of e: ");
        e = input.nextDouble();
        System.out.print("Enter the value of f: ");
        f = input.nextDouble();
        
        if ((a*d)- (b*c) == 0)
            System.out.println("The equation has no solution");
        else{
            double x = ((e*d)-(b*f))/((a*d)-(b*c));
            double y= ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    
}
