package homework_week_6;
/**
 * Write a program to calculate the area of a triangle.
 */
import java.util.Scanner;
public class Programme8_AreaOfTriangle {
    public static void main(String[ ] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length of triangle: ");
        int length= scanner.nextInt();
        System.out.println("Please enter the height of triangle: ");
        int height= scanner.nextInt();
        areaOfTriangle(length,height);
        scanner.close();    // closing the scanner
    }
    //caculating the area of triangle with no returntype with parameter method
    public static void areaOfTriangle(int length,int height){
        int area=(length*height)/2;
        System.out.println("The area of triangle is: "+ area);
    }

}
