package homework_week_6;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_4 {
    String name="Prime";//instance variable
    String surname="Testing";//instance variable

    static boolean a=true;//static variable
    static boolean b= false;//static variable
    // instance method
    public void instanceMethod(){
        Programme_4 programme_4= new Programme_4();
        System.out.println(name);
        System.out.println(surname);
        System.out.println(programme_4.a);
        System.out.println(programme_4.b);
    }

    //static method
    public static void staticMethod(){
        Programme_4 programme4=new Programme_4();
        System.out.println(programme4.name);
        System.out.println(programme4.surname);
        System.out.println(a);
        System.out.println(b);
    }
    //main method
    public static void main(String[] args){
        Programme_4 programme_4=new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }





}
