package exercise3;

import exercise3.concrete_classes.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class CarTest {

    private final PrintStream originalOut = System.out;
    private Car car;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        car = new Car();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testTurnOnWhenEngineIsOff() {
        car.turnOn();

        String output = outContent.toString()
                .replaceAll("\\r?\\n", " ")
                .trim();

        assertTrue("Should indicate the car is turning on",
                output.contains("Turning the car on."));

        assertTrue("Should print engine sound",
                output.contains("Brom Brom"));
    }

    @Test
    public void testTurnOnWhenEngineIsAlreadyOn() {
        car.turnOn();
        outContent.reset();
        car.turnOn();

        String output = outContent.toString()
                .replaceAll("\\r?\\n", " ")
                .trim();

        assertTrue("Should indicate the engine was already on",
                output.contains("The engine was already on"));
    }

    @Test
    public void testTAccelerate() {
        car.turnOn();
        outContent.reset();
        car.accelerate();

        String output = outContent.toString()
                .replaceAll("\\r?\\n", " ")
                .trim();

        assertTrue("Should indicate the engine is accelerating",
                output.contains("Accelerating!!"));

        assertTrue("Should indicate the current velocity",
                output.contains("Current velocity"));
    }

    @Test
    public void testTDecelerateMustStopInZero() {
        car.turnOn();
        outContent.reset();
        car.decelerate();

        String output = outContent.toString()
                .replaceAll("\\r?\\n", " ")
                .trim();

        assertTrue("Should indicate the engine is decelerating",
                output.contains("Decelerating!!"));

        assertTrue("Should indicate the current velocity is 0",
                output.contains("Current velocity: 0km/h"));
    }
}
