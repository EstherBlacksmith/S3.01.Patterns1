package exercise3.commands;

import exercise3.interfaces.CommandInterface;
import exercise3.interfaces.VehicleInterface;

public class Decelerate implements CommandInterface {
    private VehicleInterface vehicleInterface;

    public Decelerate(VehicleInterface vehicleInterface) {
        this.vehicleInterface = vehicleInterface;
    }

    @Override
    public void execute() {
        vehicleInterface.decelerate();
    }
}
