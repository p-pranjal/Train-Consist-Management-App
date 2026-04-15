public class TrainConsistManagementApp {

    public static boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=======================================\n");

        //  Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG507"};

        //  Search key
        String searchId = "BG309";

        //  Display all IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        //  Search
        boolean found = linearSearch(bogieIds, searchId);

        //  Result
        System.out.println("\n\nSearching for: " + searchId);

        if (found) {
            System.out.println("Bogie Found!");
        } else {
            System.out.println("Bogie Not Found!");
        }

        System.out.println("\nUC18 search completed...");
    }
}