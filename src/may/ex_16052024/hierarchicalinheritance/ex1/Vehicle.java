package may.ex_16052024.hierarchicalinheritance.ex1;

public class Vehicle {
    Vehicle() {
        System.out.println("Dc Vehicle");
    }
    void VehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
}
}
