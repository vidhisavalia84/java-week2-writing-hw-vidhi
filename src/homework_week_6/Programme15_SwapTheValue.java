package homework_week_6;
import java.util.Scanner;
/**
 * Write a Java program to swap two variables.
 */
public class Programme15_SwapTheValue {
//swapping the value of variables
    public void swapTheValue(int a,int b){
        System.out.println("Before swaping, The value of first variable is : "+a+" and second variable is : "+b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping, The value of first variable is : "+a+" and second variable is : "+b);
    }

public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first=scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second=scanner.nextInt();
        Programme15_SwapTheValue t=new Programme15_SwapTheValue();
        t.swapTheValue(first,second);
        scanner.close();
}



}
