package may.ex_16052024.singleinheritance;

public class Programing {
    //attributes Instance variable
    int version;
    String author;


    Programing() {
        System.out.println("DC");


    }

    Programing(int version, String author) {
        this.version = version;
        this.author = author;
    }

    //this is a method because this is within in the class

void printInfo() {
    System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);

}
 void bhk3() {
     System.out.println("3bhk");
 }
}
