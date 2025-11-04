package exercise3.concrete_classes;

import exercise3.interfaces.VehicleInterface;

public class Bicycle implements VehicleInterface {
    private int velocity;
    private boolean engineOn;

    @Override
    public void turnOn() {
        if (engineOn) {
            System.out.println("The engine was already on");
        } else {
            engineOn = true;
            System.out.println("Turning the bicycle on.\n Start pedaling!!!");
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating!!");
        System.out.println("Current velocity: " + velocity + "km/h");
        velocity += 5;
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating!! ");

        System.out.println("Current velocity: " + velocity + "km/h");
        if (velocity <= 5) {
            velocity = 0;
        } else {
            velocity -= 5;
        }
    }
}
