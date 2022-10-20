package homework_week_6;
/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */import java.util.Scanner;
public class Programme19_ConvertStringToLowerCase {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the upper case sentance :");
        String uppercase=scanner.nextLine();
        Programme19_ConvertStringToLowerCase t=new Programme19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        scanner.close();

    }

    // convert string to lowercase
    public void convertStringToLowerCase(String str){
        System.out.println("The lowercase of the string is : "+str.toLowerCase());

    }
}
