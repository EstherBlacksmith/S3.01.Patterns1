package exercise3;

public class Car implements Vehicle {
    private int velocity;
    private boolean engineOn;

    @Override
    public void turnOn() {
        if (engineOn) {
            System.out.println("The engine was already on");
        } else {
            engineOn = true;
            System.out.println("Turning the car on.\nBrom Brom!! ");
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating!!");
        System.out.println("Current velocity: " + velocity + "km/h");
        velocity += 10;
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating!! ");

        System.out.println("Current velocity: " + velocity + "km/h");
        if (velocity <= 10) {
            velocity = 0;
        } else {
            velocity -= 10;
        }
    }

    public int getVelocity() {
        return this.velocity;
    }
}
