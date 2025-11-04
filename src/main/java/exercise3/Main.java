package exercise3;

import exercise3.commands.TurnOn;
import exercise3.concrete_classes.Bicycle;
import exercise3.concrete_classes.Car;
import exercise3.concrete_classes.Plane;
import exercise3.concrete_classes.Ship;
import exercise3.interfaces.CommandInterface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CommandInterface carTurnOn = new TurnOn(car);

        Parking parking = new Parking();

        parking.setCommand(carTurnOn);
        parking.drive();


        Bicycle bicycle = new Bicycle();
        CommandInterface bicycleTurnOn = new TurnOn(bicycle);

        parking.setCommand(bicycleTurnOn);
        parking.drive();

        Ship boat = new Ship();
        CommandInterface shipTurnOn = new TurnOn(boat);

        parking.setCommand(shipTurnOn);
        parking.drive();

        Plane plane = new Plane();
        CommandInterface planeTurnOn = new TurnOn(plane);

        parking.setCommand(planeTurnOn);
        parking.drive();
    }
}
