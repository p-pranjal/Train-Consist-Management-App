public class TrainConsistManagementApp {

    // 🔹 Bubble Sort Method (IMPORTANT FOR TESTING)
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop → passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compare adjacent
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // 🔹 Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("=======================================\n");

        // Input array
        int[] capacities = {72, 56, 24, 90, 70};

        // Display original
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Sort
        bubbleSort(capacities);

        // Display sorted
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}