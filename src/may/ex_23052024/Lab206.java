package may.ex_23052024;

public class Lab206 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        Car.Engine engine = c.new Engine("400cc");

        engine.start();
        c.drive();

        //Nested Class - To shield the Inner class 
    }
}

class Car {
    String make;
//constructor
    public Car(String make) {
        this.make = make;
    }
    //Method
    void drive() {
        System.out.println("you can drive car");
    }
    class Engine{
        //Instance variables
        String hoursepower;
        //constructor
        public Engine(String hoursepower) {
            this.hoursepower = hoursepower;
        }
        //Method
        void start() {
            System.out.println("Engineer is started!!->"+make);
        }


    }
}
