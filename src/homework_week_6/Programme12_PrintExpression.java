package homework_week_6;

/*Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Programme12_PrintExpression {

    public static void main(String[] args){
        Programme12_PrintExpression t=new Programme12_PrintExpression();
        t.printExpression();;
    }

    public void printExpression()

    {
        double a=((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(a);
    }


}