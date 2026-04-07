import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    // Test 1: Valid inputs
    @Test
    void testRegex_ValidInputs() {
        assertTrue(validateTrainID("TRN-1234"));
        assertTrue(validateCargoCode("PET-AB"));
    }

    // Test 2: Invalid formats
    @Test
    void testRegex_InvalidFormats() {
        assertFalse(validateTrainID("TRAIN12"));
        assertFalse(validateCargoCode("PET123"));
    }

    // Test 3: Edge cases (length + case)
    @Test
    void testRegex_EdgeCases() {
        assertFalse(validateTrainID("TRN-123"));     // less digits
        assertFalse(validateTrainID("TRN-12345"));   // extra digits
        assertFalse(validateCargoCode("PET-ab"));    // lowercase
    }
}