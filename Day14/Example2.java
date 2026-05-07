import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create TreeMap
        TreeMap<String, Integer> marks = new TreeMap<>();

        // Insert data
        marks.put("Tafsir", 85);
        marks.put("Rahim", 90);
        marks.put("Karim", 78);

        // Automatically sorted by key
        System.out.println("Sorted Map: " + marks);

        // First and last key
        System.out.println("First Key: " + marks.firstKey());
        System.out.println("Last Key: " + marks.lastKey());

        // Loop through map
        for (String key : marks.keySet()) {
            System.out.println(key + " -> " + marks.get(key));
        }

        // Remove element
        marks.remove("Karim");

        System.out.println("After removal: " + marks);
    }
}
