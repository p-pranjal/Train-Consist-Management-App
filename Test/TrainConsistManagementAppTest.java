import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    // Test 1: Found case
    @Test
    void testSearch_Found() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(linearSearch(arr, "BG205"));
    }

    //  Test 2: Not found case
    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertFalse(linearSearch(arr, "BG999"));
    }

    // Test 3: Early termination behavior
    @Test
    void testSearch_EarlyMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(linearSearch(arr, "BG101")); // first element
    }
}