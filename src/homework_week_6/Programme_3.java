package homework_week_6;
/*
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {
    // Declare one instance and one static variable
    String name="Prime";
    static  String surname="testing";

    public void instanceMethod(){
        Programme_3 programme_3=new Programme_3();
        System.out.println(name);
        System.out.println(programme_3.surname);
    }
    public static void staticMethod(){
        Programme_3 programme_3=new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }
    public static void main(String[] args){
        Programme_3 programme_3=new Programme_3();
        programme_3.instanceMethod();
        staticMethod();;
    }

}
