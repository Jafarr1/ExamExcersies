package transports;

public class Car extends Vehicle{


    public Car(boolean engineIsStarted) {
        super(engineIsStarted);
    }

    public void Drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void startEngine() {
        super.startEngine("Car");
    }
}
