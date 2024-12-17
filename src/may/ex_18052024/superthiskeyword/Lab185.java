package may.ex_18052024.superthiskeyword;

public class Lab185 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2= new Dog("Lab");
        d2.display();
        Dog d3= new Dog("Golden Retriever", "DOG TT");
        d3.display();
        // Constructor chaining ->  Child DC -> Parent's DC
    }
}

class Animal {
    String type;
     Animal() {
        System.out.println("Animal DC");
    }
    Animal (String type) {
         this.type=type;
        System.out.println("Animal PC");
    }
}
class Dog extends Animal {
    String bread;
    int a;
    Dog() {
        super();
        System.out.println("Dog Dc");
    }
//constructor chaining
    Dog(String bread) {
        super("DOG TYPE");
        this.bread = bread;
    }
    Dog(String bread, String type) {
        this("Bread Set By Dog Only");
        this.type= type;
        System.out.println("Pc with two Arg.");
    }

    Dog(String bread, String type, int a) {
        this("Bread Set By Dog Only", "Golden R");
        this.a = a;
        System.out.println("Pc with two Arg.");
    }

        void display() {
            System.out.println("Type: " + type + ", Breed: " + bread);
    }
}




