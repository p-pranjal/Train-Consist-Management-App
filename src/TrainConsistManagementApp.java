public class TrainConsistManagementApp {

    // Core method (for testing)
    public static boolean searchBogie(String[] bogieIds, String searchId) {

        // FAIL-FAST VALIDATION
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // SEARCH LOGIC (Linear Search)
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("=======================================\n");

        // Empty train scenario
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        // Attempt search (will throw exception)
        boolean found = searchBogie(bogieIds, searchId);

        if (found) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }

        System.out.println("\nUC20 execution completed...");
    }
}