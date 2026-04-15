import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    //  Test 1: Exception when empty
    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () -> {
            searchBogie(arr, "BG101");
        });
    }

    // Test 2: Search works when data exists
    @Test
    void testSearch_WithData() {
        String[] arr = {"BG101", "BG205"};

        assertTrue(searchBogie(arr, "BG101"));
    }

    // Test 3: Not found case
    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101", "BG205"};

        assertFalse(searchBogie(arr, "BG999"));
    }
}