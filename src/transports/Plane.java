package transports;

public class Plane extends Vehicle {

    Plane(boolean engineIsStarted) {
        super(engineIsStarted);

    }


    public void Fly() {
        System.out.println("The plane is flying");
    }

    @Override
    public void startEngine() {
        super.startEngine("Plane");

    }
}

