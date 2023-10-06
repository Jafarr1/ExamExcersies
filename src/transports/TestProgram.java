package transports;

import java.util.ArrayList;

public class TestProgram {
    public static void main(String[] args) {
        new TestProgram().run();
    }

    private void run() {
        Car car = new Car(false);
        Plane plane = new Plane(false);
        Ship ship = new Ship(true);

       /* car.startEngine();
        car.Drive();

        plane.startEngine();
        plane.Fly();

        ship.startEngine();
        ship.Sail();


        */

        ArrayList<Vehicle> vehicle = new ArrayList();
        vehicle.add(car);
        vehicle.add(plane);
        vehicle.add(ship);




        for (int i = 0; i < vehicle.size(); i++) {
            if (vehicle.get(i) instanceof Car)
                System.out.println("Car");
            if (vehicle.get(i) instanceof Plane)
                System.out.println("Plane");
            if (vehicle.get(i) instanceof Car)
                ((Car) vehicle.get(i)).Drive();
            if (vehicle.get(i) instanceof Plane)
                ((Plane) vehicle.get(i)).Fly();
            if (vehicle.get(i) instanceof Ship)
                System.out.println("Ship");
            if (vehicle.get(i) instanceof Ship)
                ((Ship) vehicle.get(i)).Sail();

        }
        car.startEngine();
        ship.startEngine();
        plane.startEngine();
    }
}
