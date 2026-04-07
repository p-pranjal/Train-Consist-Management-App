import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    private List<Bogie> getBogies() {
        return generateBogies(1000);
    }

    // Test 1: Loop vs Stream result equality
    @Test
    void testPerformance_ResultConsistency() {

        List<Bogie> bogies = getBogies();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    // Test 2: Filtering correctness
    @Test
    void testPerformance_FilterCondition() {

        List<Bogie> result = getBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    // Test 3: Large dataset handling
    @Test
    void testPerformance_LargeDataset() {

        List<Bogie> bogies = generateBogies(50000);

        assertDoesNotThrow(() -> {
            bogies.stream().filter(b -> b.capacity > 60).toList();
        });
    }
}