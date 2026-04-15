import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    // Test 1: Valid capacity
    @Test
    void testValidCapacity() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 72);
        assertEquals(72, bogie.capacity);
    }

    // Test 2: Negative capacity
    @Test
    void testNegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", -5);
        });
    }

    // Test 3: Zero capacity
    @Test
    void testZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("First Class", 0);
        });
    }
}