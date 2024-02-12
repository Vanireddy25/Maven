package threads;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

// first we can set a timeout
//the deadlock doesn't occur within this time limit, the test fails,
//indicating that the expected deadlock scenario did not manifest.
// If an exception is thrown during the execution,indicating a deadlock,the test passes.
    @Test(timeout = 1000)
    public void testDeadlockCreation() {
        try {
            DeadlockExample.createDeadlock();
            // If a deadlock occurs, the test will not reach this point
            fail("Expected a deadlock to occur, but it didn't.");
        } catch (Exception e) {
            // If a deadlock occurs, it will be caught here
            assertTrue(true); // Indicate that the test passed
        }
    }
}