package homework_week_6;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
import java.util.Scanner;
public class Programme17_DecimalToBinary {
    //convert the decimal to binary
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     System.out.println("welcome to java programme to convert decimal to binary number ");
     System.out.println("Please enter the decimal number");
     int num=scanner.nextInt();convertDecimalToBinary(num);
     scanner.close();
    }


    public static void convertDecimalToBinary(int number){
        String binary=Integer.toBinaryString(number);
        System.out.println(" The binary value is : "+ binary);
    }





}
