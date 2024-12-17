package may.ex_14052024;

public class Person {
    String name;
    int age;


    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Person(Person Person){
     this.name=   Person.name;
     this.age=   Person.age;
    }

    public static void main(String[] args) {
        Person Person1 = new Person("john", 30);
        Person Person2 = new Person(Person1);
        Person Person3 = new Person(Person1);
        Person Person4 = new Person(Person1);
        System.out.println(Person2.name + " is " + Person2.age + " years old");


    }
}
