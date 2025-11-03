package exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonUndoTest {

    @Test
    public void testGetInstanceAlwaysReturnsTheSameInstance() {

            SingletonUndo instance1 = SingletonUndo.getInstance();
            SingletonUndo instance2 = SingletonUndo.getInstance();

            assertSame("Method 'getInstance()' should always return the same object", instance1, instance2);

    }



    @Test
    public void testGetInstanceIsTheSameInDifferentsThreads() throws InterruptedException {
        final SingletonUndo[] instances = new SingletonUndo[2];

        Thread thread1 = new Thread(() -> instances[0] = SingletonUndo.getInstance());
        Thread thread2 = new Thread(() -> instances[1] = SingletonUndo.getInstance());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        assertSame("'getInstance()' should be 'synchronized' and return the same instance in all threads",
                instances[0], instances[1]);
    }
}