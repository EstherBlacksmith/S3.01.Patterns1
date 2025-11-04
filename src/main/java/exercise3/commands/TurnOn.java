package exercise3.commands;

import exercise3.interfaces.CommandInterface;
import exercise3.interfaces.VehicleInterface;

public class TurnOn implements CommandInterface {

    private VehicleInterface vehicleInterface;

    public TurnOn(VehicleInterface vehicleInterface) {
        this.vehicleInterface = vehicleInterface;
    }

    @Override
    public void execute() {
        vehicleInterface.turnOn();
    }

}
