package may.ex_21052024.interfacekeyword;

public class Car implements Brake,Engine{
    @Override
    public void applyBreak() {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Strating Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");

    }
}
