package homework_week_6;
/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    //declare two variables
    int a=10;
    int b=20;
    //declare one instance method
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
public static void main(String[] args){
        Programme1 programme1=new Programme1();
        programme1.instanceMethod();
}



}
