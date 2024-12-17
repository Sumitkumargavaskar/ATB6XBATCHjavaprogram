package may.ex_21052024.interfacekeyword;

public class Lab198 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        c1.applyBreak();
        c1.stopEngine();


        // Default
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();

        // Engine.M1();


    }
}
