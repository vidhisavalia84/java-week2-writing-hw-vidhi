package homework_week_6;
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
import java.util.Scanner;
public class Programme16_addTwoBinary {
    public static void main(String[] args){
    System.out.println("Welcome to java programme to add two binary numbers");
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the first binary number : ");
    String first=scanner.nextLine();
    System.out.println("Enter the second binary number :");
    String second=scanner.nextLine();
    String addition=addTwoBinaryNumbers(first,second);
    System.out.println("The addition of two binary number is : "+ addition);
    scanner.close();


}
    //adding two binary number
    public static String addTwoBinaryNumbers(String first,String second){
        int b1=Integer.parseInt(first,2);
        int b2=Integer.parseInt(second,2);
        int sum=b1+b2;
        return Integer.toBinaryString(sum);
    }
}
