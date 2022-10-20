package homework_week_6;
import java.util.Scanner;
/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14_AreaAndParameter {
    //calculating an area and parameter of rectangle
    public static void areaAndParameterOfRectangle(double height,double width){
        double parameter=2*(height+width);
        double area=(height*width);
        System.out.println("The area of rectangle is : "+ area);
        System.out.println("The parameter of rectangle is : "+parameter);
    }

public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the height of the rectangle :");
       double height=scanner.nextDouble();
       System.out.println("Enter the width of rectangle: ");
       double width=scanner.nextDouble();
       areaAndParameterOfRectangle(height,width);
       scanner.close();
}


}
