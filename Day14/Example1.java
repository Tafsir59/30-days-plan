import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // Insert data
        marks.put("Tafsir", 85);
        marks.put("Rahim", 90);
        marks.put("Karim", 78);

        // Access value
        System.out.println("Tafsir Marks: " + marks.get("Tafsir"));

        // Loop through map
        for (String key : marks.keySet()) {
            System.out.println(key + " -> " + marks.get(key));
        }

        // Check key
        if (marks.containsKey("Rahim")) {
            System.out.println("Rahim exists!");
        }

        // Remove entry
        marks.remove("Karim");

        System.out.println("After removal: " + marks);
    }
}
