package may.ex_11052024;

public class Person {
    // Attribute
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eye_color;


    // Behav / Functionality
 //no return type no parameter
    void walk() {
        System.out.println("i can walk");
    }
    // no return type parameter
            void talk(String msg){
            System.out.println("I will say ->" + msg);
        }
        //return type without parameter
            String sleep () {
            return "Sleeing";


        }
        //return type with parameter
            String eat (String item){
            return item;
        }
        }
