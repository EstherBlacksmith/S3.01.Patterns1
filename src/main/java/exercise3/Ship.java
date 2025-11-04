package exercise3;

public class Ship implements Vehicle {
    private int velocity;
    private boolean engineOn;

    @Override
    public void turnOn() {
        if (engineOn) {
            System.out.println("The engine was already on");
        } else {
            engineOn = true;
            System.out.println("Turning the ship on.\n Shooo! Shooo! ");
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating!!");
        System.out.println("Current velocity: " + velocity + "mn");
        velocity += 15;
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating!! ");

        System.out.println("Current velocity: " + velocity + "mn");
        if (velocity <= 15) {
            velocity = 0;
        } else {
            velocity -= 15;
        }
    }
}
