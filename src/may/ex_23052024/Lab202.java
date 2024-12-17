package may.ex_23052024;

public class Lab202 {
    public static void main(String[] args) {
        Person P1 = new Person("Amit");
        Person P2 = new Person("kumar");
        System.out.println(Person.footBallClub);

        //static function call
        //class name. func
        Person.m1();
      //  P1.m1();
    //    P2.m1();
        //  Nonstatic Ref
        P1.m2();
        P2.m2();
    }
}

class Person {
    static String footBallClub ="Arsenal";

    static{
        System.out.println("once, when class is loaded");
    }
    {
        System.out.println("IIB");
    }
    //static F(n)
    static void m1(){
        System.out.println("I am common F(n)");
    }
    //Non static F(n)

    void m2(){
        System.out.println("Person -> "+this.name);
    }

    String name; //non static

    public Person(String name) {
        this.name = name;
    }
}
