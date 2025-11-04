package exercise3;

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
