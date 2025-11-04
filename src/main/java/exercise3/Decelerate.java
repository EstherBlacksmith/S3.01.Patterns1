package exercise3;

public class Decelerate implements CommandInterface {
    private Vehicle vehicle;

    public Decelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.decelerate();
    }
}
