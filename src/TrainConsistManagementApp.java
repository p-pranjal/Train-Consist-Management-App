import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie model (reuse)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Generate large dataset (important for benchmarking)
    public static List<Bogie> generateBogies(int size) {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Bogie("Sleeper", (i % 100) + 1));
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("===========================================\n");

        List<Bogie> bogies = generateBogies(100000); // large dataset

        // LOOP BASED
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // STREAM BASED
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}