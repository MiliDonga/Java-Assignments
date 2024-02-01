package Task_6;
import java.util.*;

public class Excercise10 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 30);
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 35);
        hashMap.put("Diana", 28);

        System.out.println("Sorting by keys:");
        TreeMap<String, Integer> sortedByKey = new TreeMap<>(hashMap);
        printMap(sortedByKey);

        System.out.println("\nSorting by values:");
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        HashMap<String, Integer> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedByValue);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
