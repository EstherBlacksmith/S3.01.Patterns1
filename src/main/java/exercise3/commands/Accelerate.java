package exercise3.commands;

import exercise3.interfaces.CommandInterface;
import exercise3.interfaces.VehicleInterface;

public class Accelerate implements CommandInterface {

    private VehicleInterface vehicleInterface;

    public Accelerate(VehicleInterface vehicleInterface) {
        this.vehicleInterface = vehicleInterface;
    }

    @Override
    public void execute() {
        vehicleInterface.accelerate();
    }
}
