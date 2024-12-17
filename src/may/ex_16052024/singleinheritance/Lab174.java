package may.ex_16052024.singleinheritance;

public class Lab174 {
    public static void main(String[] args) {
        // ## What is Inheritance?
        // Inherit Attributes and Behaviour from the parent, Grand parent.

        // Superclass |  Parent Class | Base Class
        // Subclass |  Child Class | Derived Class

        // Parent -> Child

        // Child extends Parent {}
        // extend keyword -> parent's Attributes are available to the child(class)

        // Single Inheritance
        // Parent -> Pro
        // Child -> Java

        // Java extends Programming

        Programing p = new Programing(12, "ko posan");
        Java j = new Java("lambda exp");
        p.printInfo();
        j.printInfo();

        Programing p1 = new Programing(12, "Van Russom");
        p1.printInfo();

        Python python = new Python();
        python.printInfo();


    }
}
