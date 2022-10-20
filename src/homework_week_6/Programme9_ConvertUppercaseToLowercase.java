package homework_week_6;
/**
 * Write a program to convert the upper case to lower case.
 */
import java.util.Scanner;
public class Programme9_ConvertUppercaseToLowercase {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the uppercase string: ");
        String uppercase=scanner.nextLine();
        Programme9_ConvertUppercaseToLowercase t=new Programme9_ConvertUppercaseToLowercase();
        t.convertUppecaseToLowercase(uppercase);
        scanner.close();
    }
    //conversation of uppercase to lowercase
    public void convertUppecaseToLowercase(String text){
        System.out.println("The Lowercase value is ="+text.toLowerCase());
    }
}
