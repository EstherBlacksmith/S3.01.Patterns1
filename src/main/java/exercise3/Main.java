package exercise3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CommandInterface carTurnOn = new TurnOn(car);

        Parking parking = new Parking();

        parking.setCommand(carTurnOn);
        parking.drive();
    }
}
