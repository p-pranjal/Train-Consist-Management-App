import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    // Test 1: Basic sorting
    @Test
    void testSort_Basic() {
        String[] arr = {"Sleeper", "AC Chair", "General"};

        sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "General", "Sleeper"},
                arr
        );
    }

    // Test 2: Already sorted
    @Test
    void testSort_AlreadySorted() {
        String[] arr = {"AC Chair", "First Class", "Sleeper"};

        sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "First Class", "Sleeper"},
                arr
        );
    }

    // Test 3: Random order input
    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury", "General", "AC Chair"};

        sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair", "General", "Luxury"},
                arr
        );
    }
}