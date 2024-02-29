import java.util.*;

public class KeysAndValues {
    public static List<List<Object>> keysAndValues(Map<String, Object> obj) {
        List<String> sortedKeys = new ArrayList<>(obj.keySet());
        Collections.sort(sortedKeys);

        List<Object> keys = new ArrayList<>();
        List<Object> values = new ArrayList<>();

        for (String key : sortedKeys) {
            keys.add(key);
            values.add(obj.get(key));
        }

        List<List<Object>> result = new ArrayList<>();
        result.add(keys);
        result.add(values);
        return result;
    }

    public static void main(String[] args) {
        Map<String, Object> test1 = new HashMap<>();
        test1.put("a", 1);
        test1.put("b", 2);
        test1.put("c", 3);

        Map<String, Object> test2 = new HashMap<>();
        test2.put("a", "._");
        test2.put("b", "_...");
        test2.put("c", "_._.");

        Map<String, Object> test3 = new HashMap<>();
        test3.put("key1", true);
        test3.put("key2", false);
        test3.put("key3", null);

        System.out.println(keysAndValues(test1));
        System.out.println(keysAndValues(test2));
        System.out.println(keysAndValues(test3));
    }
}
