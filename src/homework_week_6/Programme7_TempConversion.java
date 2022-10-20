package homework_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;
public class Programme7_TempConversion {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the temperature in degree farenheit : ");
    float temp=scanner.nextFloat();
    Programme7_TempConversion t=new Programme7_TempConversion();
    t.convertTempToDegreeCelsious(temp);
    scanner.close();
}

    //Temperature conversatoin
    public void convertTempToDegreeCelsious(float temp) {
        float c= ((temp-32)*5/9);
        System.out.println("The temperature "+temp+" farenheit is equal to "+c+" degree celsious");
    }


}