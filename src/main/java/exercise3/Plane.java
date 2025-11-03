package exercise3;

public class Plane implements Vehicle{
    private boolean engineOn;
    private int velocity;

    @Override
    public void turnOn() {
        if (engineOn){
            System.out.println("The engine was already on");
        }else{
            engineOn = true;
            System.out.println("Turning the plane on.\nFiownn!!! ");
        }

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating!!");
        System.out.println("Current velocity: " + velocity + "mph");
        velocity += 100;
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating!! " );

        System.out.println("Current velocity: " + velocity + "mph");
        if(velocity <= 100){
            velocity = 0;
        }else {
            velocity -= 100;
        }
    }
}
