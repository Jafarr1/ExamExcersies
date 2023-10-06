package transports;
public abstract class Vehicle {
    private boolean engineIsStarted;

    public Vehicle(boolean engineIsStarted) {
        this.engineIsStarted = engineIsStarted;
    }


    public void startEngine(String vehicleType) {
        if (!engineIsStarted) {
            engineIsStarted = true;
            System.out.println(vehicleType + " Engined started");
        } else {
            System.out.println(vehicleType + " Engine is already running..");

        }

    }


    public abstract void startEngine();
}
