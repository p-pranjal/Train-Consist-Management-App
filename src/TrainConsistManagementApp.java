import java.util.Arrays;

public class TrainConsistManagementApp {

    //  Core method (for testing)
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=======================================\n");

        //  Array
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        //  Ensure sorted (important precondition)
        Arrays.sort(bogieIds);

        //  Search key
        String key = "BG309";

        //  Display sorted IDs
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search
        boolean found = binarySearch(bogieIds, key);

        System.out.println();

        if (found) {
            System.out.println("Bogie " + key + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + key + " not found.");
        }
    }
}