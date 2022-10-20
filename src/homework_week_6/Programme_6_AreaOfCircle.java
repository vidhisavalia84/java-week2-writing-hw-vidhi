package homework_week_6;

 //Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 import java.util.Scanner;
public class Programme_6_AreaOfCircle {
public static void main(String[] args){
    //scanner declaration for reading input from consol
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Radious : ");
    double raious= scanner.nextDouble();
    areaOfCircle(raious);
    scanner.close();
}
//calculating if area of the circle
    public static void areaOfCircle(double radious){
    double pi=Math.PI;
    double area=(pi*radious*radious);
    System.out.println("The Area of Circle is: "+ area);
    }


}
