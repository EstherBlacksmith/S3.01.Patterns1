package exercise3;

public class TurnOn implements CommandInterface {

    private Vehicle vehicle;

    public TurnOn(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.turnOn();
    }

}
