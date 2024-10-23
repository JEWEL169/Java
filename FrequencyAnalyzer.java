import java.util.*;

public class FrequencyAnalyzer {
    // Static variable to store the array
    private static int[] array;

    // Static method to find K numbers with the highest occurrences
    public static void findTopKFrequent(int K) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue to store the top K elements based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> (a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : b.getValue() - a.getValue())
        );

        // Step 3: Add all elements from the map to the priority queue
        maxHeap.addAll(frequencyMap.entrySet());

        // Step 4: Extract the top K elements and print them
        for (int i = 0; i < K; i++) {
            System.out.print(maxHeap.poll().getKey() + " ");
        }
    }

    public static void main(String[] args) {
        // Test case 1
        array = new int[]{3, 1, 4, 4, 5, 2, 6, 1};
        int K = 2;
        System.out.print("Test Case 1: ");
        findTopKFrequent(K);  // Output: 4 1
        System.out.println();

        // Test case 2
        array = new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        K = 4;
        System.out.print("Test Case 2: ");
        findTopKFrequent(K);  // Output: 5 11 7 10
        System.out.println();
    }
}

