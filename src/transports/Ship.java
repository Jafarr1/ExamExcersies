package transports;

public class Ship extends Vehicle {


    public Ship(boolean engineIsStarted) {
        super(engineIsStarted);
    }

    public void Sail() {
        System.out.println("Ship is sailing");
    }

    @Override
    public void startEngine() {
        super.startEngine("Ship");
    }
}
