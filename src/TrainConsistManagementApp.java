import java.util.Arrays;

public class TrainConsistManagementApp {

    // Core method (for testing)
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC17 - Sort Bogie Names using Arrays.sort() ");
        System.out.println("=======================================\n");

        // Input array
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        sortBogieNames(bogieNames);

        // Display sorted
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}